package com.best.goldenguide.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.best.goldenguide.model.CityImages;
import com.best.goldenguide.model.Place;

@Repository
public class CityImagesDao {
	@Autowired
	SessionFactory sessionFactory;
	public Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void saveCityImages(CityImages ci){
		getCurrentSession().save(ci);
	}
	public List<CityImages> getCityImagesList(){
		return getCurrentSession().createCriteria(CityImages.class).list();
	}
}
