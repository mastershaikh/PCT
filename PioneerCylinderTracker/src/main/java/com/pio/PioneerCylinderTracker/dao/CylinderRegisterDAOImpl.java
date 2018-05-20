package com.pio.PioneerCylinderTracker.dao;

import java.util.Optional;

import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pio.PioneerCylinderTracker.model.CylinderBean;

@Repository
public class CylinderRegisterDAOImpl implements CylinderRegisterDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public CylinderRegisterDAOImpl(EntityManagerFactory factory) {
		if(factory.unwrap(SessionFactory.class) == null){
		      throw new NullPointerException("factory is not a hibernate factory");
		    }
		    this.sessionFactory = factory.unwrap(SessionFactory.class);
	}
	
	@Override
	@Transactional
	public String cylinderRegister(CylinderBean cylinder) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cylinder);
		return "SUCCESS";
	}

	@Override
	@Transactional
	public Optional<CylinderBean> checkCylinder(Long cylinderId) {
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<CylinderBean> query = builder.createQuery(CylinderBean.class);
			
			Root<CylinderBean> root = query.from(CylinderBean.class);
			query.select(root).where(builder.equal(root.get("cylinderId"), cylinderId));
			
			CylinderBean cb = session.createQuery(query).getSingleResult();
			
			if(cb instanceof CylinderBean)
			return Optional.of(cb);
			
			else return Optional.empty();
			
		}catch(Exception e) {
			e.printStackTrace();
			return Optional.empty();
		}
	}
}
