package com.certificados.service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.certificados.dao.AbstractDao;
import com.certificados.model.BaseEntity;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public abstract class AbstractService<DAO extends AbstractDao<ENTITY, PK>,ENTITY extends BaseEntity<PK>,PK extends Serializable> {
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ENTITY> obterTodos() {
		return getDAO().findAll();
	}
	
	@SuppressWarnings("unchecked")
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ENTITY obterPorId(@PathParam(value = "id") Long id) {
		return getDAO().findById((PK)id);
	}
	
	@POST
	@Path("/")
	@Consumes(value=MediaType.APPLICATION_JSON)
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void cadastrar(ENTITY obj) {
		getDAO().saveOrUpdate(obj);
	}
	
	@SuppressWarnings("unchecked")
	@DELETE
	@Path("/{id}")
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void remover(@PathParam("id") Long id) {
		getDAO().remove((PK)id);
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(value=MediaType.APPLICATION_JSON)
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void atualizar(@PathParam("id") Long id,ENTITY obj) {
		getDAO().saveOrUpdate(obj);
	}
	
	protected abstract DAO getDAO();
	
	
}
