package org.springgarden;

import java.util.List;

public interface IParcelle {

	public abstract void melanger();

	public abstract String getNom();
	
	public abstract void setNom(String nom);
	
	public abstract List<IPlante> getPlantes();

	public abstract void setPlantes(List<IPlante> plantes);
	
	
}