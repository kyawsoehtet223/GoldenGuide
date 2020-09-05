package com.best.goldenguide.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.best.goldenguide.model.City;
import com.best.goldenguide.model.State;

@Repository
public class Dao {

	@Autowired
	SessionFactory sessionfactory;
	
	public Session getSession() {
		return sessionfactory.getCurrentSession();
	}
	
	public void saveState(State s) {
		getSession().save(s);
	}
	
	public List<State> getStateList(){
		Criteria cr=getSession().createCriteria(State.class);
		return (List<State>)cr.list();
	}
	
	public void saveCity(City c) {
		getSession().save(c);
	}
	
	public List<City> getCityList(){
		Criteria cr=getSession().createCriteria(City.class);
		return (List<City>)cr.list();
	}
}
