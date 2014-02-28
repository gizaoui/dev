package org.springgarden.implement;

import java.util.List;

import org.apache.log4j.Logger;
import org.springgarden.IJardin;
import org.springgarden.IJardinier;
import org.springgarden.IParcelle;


public class Jardin implements IJardin {

	private static Logger logger = Logger.getLogger(Jardin.class);

	List<IParcelle> parcelles;

	IJardinier jardinier;

	int doseEngrais;

	int doseEau;

	public void jardiner() {
		logger.debug("jardiner");
	}

	public int getDoseEngrais() {
		return doseEngrais;
	}

	public void setDoseEngrais(int doseEngrais) {
		this.doseEngrais = doseEngrais;
		logger.debug("doseEngrais : " + doseEngrais);
	}

	public int getDoseEau() {
		return doseEau;
	}

	public void setDoseEau(int doseEau) {
		this.doseEau = doseEau;
		logger.debug("doseEau : " + doseEau);
	}

	public IJardinier getJardinier() {
		return jardinier;
	}

	public void setJardinier(IJardinier jardinier) {
		this.jardinier = jardinier;
		logger.debug("jardinier.getNom() : " + jardinier.getNom());
	}

	public List<IParcelle> getParcelles() {
		return parcelles;
	}

	public void setParcelles(List<IParcelle> parcelles) {
		this.parcelles = parcelles;
		logger.debug("Liste des parcelles : " );
		for (IParcelle parcelle : parcelles) {
			logger.debug("      > parcelle.getNom() : " +parcelle.getNom());
		}

	}

}
