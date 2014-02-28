package org.springgarden.implement;

import org.apache.log4j.Logger;
import org.springgarden.IJardinier;

public class Jardinier implements IJardinier {

	private static Logger logger = Logger.getLogger(Jardinier.class);

	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Monsieur " + nom;
	}


}