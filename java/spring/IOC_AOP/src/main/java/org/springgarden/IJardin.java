package org.springgarden;

import java.util.List;


public interface IJardin {
	
	public abstract int getDoseEngrais();

	public abstract void setDoseEngrais(int doseEngrais);

	public abstract int getDoseEau();

	public abstract void setDoseEau(int doseEau);
	
	public abstract IJardinier getJardinier();

	public abstract void setJardinier(IJardinier jardinier);
	
	public abstract List<IParcelle> getParcelles();

	public abstract void setParcelles(List<IParcelle> parcelles);
	
	public abstract void jardiner();
	
}