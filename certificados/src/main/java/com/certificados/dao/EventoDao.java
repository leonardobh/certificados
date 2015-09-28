package com.certificados.dao;

import javax.ejb.Stateless;

import com.certificados.model.Evento;

@Stateless
public class EventoDao extends AbstractDao<Evento, Long> {

	public EventoDao() {
		super(Evento.class);
	}

}
