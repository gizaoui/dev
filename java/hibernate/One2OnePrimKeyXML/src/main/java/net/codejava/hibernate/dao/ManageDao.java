package net.codejava.hibernate.dao;

import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class ManageDao extends HibernateDaoSupport {
	
	public void clean() throws DataAccessException {
		HibernateTemplate hibernateTemplate = getHibernateTemplate();
		hibernateTemplate.flush();
		hibernateTemplate.clear();
	}

	public void save(Object daoObject) throws DataAccessException {
		getHibernateTemplate().save(daoObject);

	}
	
	public void saveOrUpdate(Object daoObject) throws DataAccessException {
		getHibernateTemplate().merge(daoObject);
	}

	public void delete(Object daoObject) throws DataAccessException {
		getHibernateTemplate().delete(daoObject);
	}

	public void deleteAll(Collection<?> entities) throws DataAccessException {
		getHibernateTemplate().deleteAll(entities);
	}

	public void saveOrUpdateAll(Collection<?> entities)
			throws DataAccessException {
		this.getHibernateTemplate().saveOrUpdateAll(entities);
	}
		
	public List<?> selectAll(Class<?> tClass) {
		DetachedCriteria criteria=DetachedCriteria.forClass(tClass);
		return getHibernateTemplate().findByCriteria(criteria);
	}

	

}
