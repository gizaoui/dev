package org.springgarden.implement;

import org.springframework.stereotype.Component;
import org.springgarden.IPlante;


@Component
public class Plante implements IPlante {


	private String nomPlante;

	private int eau;

	private int engrais;

	public String getNomPlante() {
		return nomPlante;
	}

	public void setNomPlante(String nomPlante) {
		this.nomPlante = nomPlante;
	}
	
	@Override
	public String toString() {
		return nomPlante;
	}
	
}
