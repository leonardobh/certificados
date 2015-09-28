package com.certificados.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.certificados.model.BaseEntity;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public abstract class AbstractDao<ENTITY extends BaseEntity<PK>,PK extends Serializable> {

	@PersistenceContext(unitName="certificados-persistence-unit",type=PersistenceContextType.TRANSACTION)
	EntityManager em;
	
	@SuppressWarnings("rawtypes")
	private Class entityClass;
	
	@SuppressWarnings("rawtypes")
	public AbstractDao(Class entityClass) {
		this.entityClass = entityClass;
	}

	@SuppressWarnings("unchecked")
	public ENTITY findById(PK id) {
		return (ENTITY) em.find(entityClass, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<ENTITY> findAll() {
		return (List<ENTITY>)em.createQuery(" from "+entityClass.getName()).getResultList();
	}
	
	
	public ENTITY saveOrUpdate(ENTITY entity) {
		if(entity.isNew()) {
			em.persist(entity);
		}else {
			em.merge(entity);
		}
		return entity;
	}
	
	public boolean remove(PK id) {
		ENTITY obj = findById(id);
		if(obj != null) {
			try{
				em.remove(obj);
				return true;
			}catch(Exception e) {
				return false;
			}
		}
		return false;
	}
	
	
}
