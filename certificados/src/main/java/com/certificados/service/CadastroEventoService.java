package com.certificados.service;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.certificados.model.Evento;

@Path("/library")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class CadastroEventoService {

	@GET
	@Path("/books")
	public Collection<Evento> getEventos() {
		System.out.println("entrou no get");
		return null;
	}

}
