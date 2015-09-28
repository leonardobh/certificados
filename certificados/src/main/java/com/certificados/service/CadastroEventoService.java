package com.certificados.service;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.certificados.dao.EventoDao;
import com.certificados.model.Evento;

@Path("/eventos")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class CadastroEventoService extends AbstractService<EventoDao, Evento, Long>{

	@EJB
	private EventoDao dao;
	
	@Override
	protected EventoDao getDAO() {
		return dao;
	}

}
