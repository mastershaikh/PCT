package com.pio.PioneerCylinderTracker.dao;

import java.util.List;
import java.util.Optional;
import java.util.TreeMap;

import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pio.PioneerCylinderTracker.model.DealerDetailsBean;

@Repository
public class DealerDAOI implements DealerDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public DealerDAOI(EntityManagerFactory factory) {
		if(factory.unwrap(SessionFactory.class) == null){
		      throw new NullPointerException("factory is not a hibernate factory");
		    }
		this.sessionFactory = factory.unwrap(SessionFactory.class);
	}
	
	@Override
	@Transactional
	public Optional<TreeMap<String,String>> dealerList() {
		Session session = sessionFactory.getCurrentSession();
		TreeMap<String,String> result = new TreeMap<>();
		try {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<DealerDetailsBean> query = builder.createQuery(DealerDetailsBean.class);
			
			Root<DealerDetailsBean> root = query.from(DealerDetailsBean.class);
			query.select(root);
			
			List<DealerDetailsBean> list = session.createQuery(query).getResultList();
			
			list.stream().forEach(dealer ->{
				result.put(dealer.getDealerId(), dealer.getDealerName() + "-"+dealer.getAddress());
			});
				
			return Optional.of(result);
			
		} catch (Exception e) {
			e.printStackTrace();
			return Optional.empty();
		}
}
}