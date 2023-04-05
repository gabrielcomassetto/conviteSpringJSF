package com.projetojsf.jsfspring.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Convite {
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataEvento;
    
    private String convidado;
    private String local;
    
    public Convite() {
    }
    

	public Convite(Date dataEvento, String convidado, String local) {
		this.dataEvento = dataEvento;
		this.convidado = convidado;
		this.local = local;
	}



	public Date getdataEvento() {
		return dataEvento;
	}

	public void setdataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getConvidado() {
		return convidado;
	}

	public void setConvidado(String convidado) {
		this.convidado = convidado;
	}


	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	

}
