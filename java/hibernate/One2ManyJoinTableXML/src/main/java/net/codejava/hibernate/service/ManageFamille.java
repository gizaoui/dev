package net.codejava.hibernate.service;

import java.util.List;

import net.codejava.hibernate.dao.ManageDao;
import net.codejava.hibernate.domaine.Famille;

public class ManageFamille {

	private ManageDao manageDao;

	public ManageDao getManageDao() {
		return manageDao;
	}

	public void setManageDao(ManageDao manageDao) {
		this.manageDao = manageDao;
	}

	public void clean() {
		getManageDao().clean();
	}

	public void add(Object daoObject) {
		getManageDao().save(daoObject);
	}

	public List<Famille> fetchAll() {
		return  (List<Famille>) getManageDao().selectAll(Famille.class);
	}

	public List<Famille> selectByCriteria(){
		return (List<Famille>) getManageDao().selectByCriteria(Famille.class);
	}
	
	public Famille selectByQuery() {
		return (Famille) getManageDao().selectByQuery("FROM Famille");
	}
	
	public List<Object[]> selectByFind() {
		return getManageDao().selectByFind("FROM Famille");
	}
	
}
