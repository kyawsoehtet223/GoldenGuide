package com.goldenguide.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.goldenguide.model.State;


@Repository
public class GoldenGuideDao {
	@Autowired
	SessionFactory sessionFactory;
	public Session getSesssion(){
		return sessionFactory.getCurrentSession();
	}
	@SuppressWarnings("unchecked")
public List<State> getStateList(){
	 Criteria state=getSesssion().createCriteria(State.class);
		return (List<State>)state.list();
	}
	

}
