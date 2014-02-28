package org.springgarden.implement;

import java.util.List;

import org.apache.log4j.Logger;
import org.springgarden.IParcelle;
import org.springgarden.IPlante;


public class Parcelle implements IParcelle {

	private static Logger logger = Logger.getLogger(Parcelle.class);

	private List<IPlante> plantes;

	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
		logger.debug("nom : " + nom);
	}
	
	
	public List<IPlante> getPlantes() {
		return plantes;
	}

	public void setPlantes(List<IPlante> plantes) {
		this.plantes = plantes;
	}	
	
	@Override
	public String toString() {
		return nom;
	}

	public void melanger() {
		// TODO Stub de la méthode généré automatiquement
		
	}

}
