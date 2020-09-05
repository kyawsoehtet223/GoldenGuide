package com.best.goldenguide.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.best.goldenguide.model.Place;


@Repository
public class PlaceDao {
	@Autowired
	SessionFactory sessionFactory;
	public Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void savePlace(Place place){
		getCurrentSession().save(place);
	}
	public List<Place> getPlaceList(){
		return getCurrentSession().createCriteria(Place.class).list();
	}
}
