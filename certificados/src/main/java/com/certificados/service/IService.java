package com.certificados.service;

import java.util.List;

import com.certificados.model.BaseEntity;

public interface IService<E extends BaseEntity> {
	
	List<E> obterTodos();
	
	

}
