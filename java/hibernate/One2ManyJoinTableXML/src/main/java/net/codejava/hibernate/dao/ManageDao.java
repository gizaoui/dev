package net.codejava.hibernate.dao;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import net.codejava.hibernate.domaine.Famille;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;
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
		Criteria criteria = getSession().createCriteria(tClass, "b");
		return criteria.list();
	}

	
	
	public List<?> selectByCriteria(final Class<?> tClass) throws DataAccessException {
		List<?> dailyAvailList = (List<?>) getHibernateTemplate()
				.execute(new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Criteria crit = session.createCriteria(tClass);
						
						/*
						 * crit.add(Restrictions.eq("accomId", accomId));
						 * crit.addOrder(Property.forName("receptifId").asc());
						 * crit.addOrder(Property.forName("roomTypeId").asc());
						 * crit.addOrder(Property.forName("nightDate").asc());
						 */
						return crit.list();
					}
				});
		return dailyAvailList;
	}

	
	
	public Object selectByQuery(final String qry) {
		Object obj = null;
		List<?> resList = (List<?>) getHibernateTemplate().execute(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createQuery(qry);

						return query.list();
					}
				});

		
		if (resList != null && resList.size() > 0) {
			obj = resList.get(0);
		}
		
		return obj;
	}
	
	
	public List<Object[]> selectByFind(String qry) throws DataAccessException {
		List<Object[]> descProviders = getHibernateTemplate().find(qry);
		return descProviders;
	}
	
}
