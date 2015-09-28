package com.certificados.model;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlTransient;

@MappedSuperclass
public abstract class BaseEntity<PK extends Serializable> {

	public abstract PK getId();
	
	public abstract void setId(PK pk);
	
	@XmlTransient
	public boolean isNew() {
		return getId() == null;
	}

}
