package com.best.goldenguide.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.best.goldenguide.dao.Dao;
import com.best.goldenguide.dto.CityDTO;
import com.best.goldenguide.model.City;
import com.best.goldenguide.model.Hotel;
import com.best.goldenguide.model.Restaurant;
import com.best.goldenguide.model.State;

@Service
@Transactional
public class GoldenGuideServices {

	@Autowired
	Dao dao;
	public String UPLOAD_DIRECTORY="/images";
	
	@Autowired
	ServletContext sc;
	
	@Transactional
	public void saveCity(CityDTO c) {
		if(c != null) {
			String path = sc.getRealPath(UPLOAD_DIRECTORY);   
	        String filename=c.getFile().getOriginalFilename();
	          
	        System.out.println(path+" "+filename);  
	        try{  
	            byte[] bytes = c.getFile().getBytes();  
	            BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(  
	                 new File(path + File.separator + filename)));  
	            stream.write(bytes);  
	            stream.flush();  
	            stream.close();  
	          
	        }catch(Exception e){System.out.println(e);}
	        City city=new City(c.getName(),c.getState(),c.getDescription(),c.getUrl());
	        dao.saveCity(city);
		}
	}
	
	public List<City> getCityList(){
		return dao.getCityList();
	}
	
	public void saveState(State s) {
		dao.saveState(s);
	}
	
	public List<State> getStateList(){
		return dao.getStateList();
	}
	
	public void saveHotel(Hotel h) {
		dao.saveHotel(h);
	}
	
	public List<Hotel> getHotelList(){
		return dao.getHotelList();
	}
	
	public void saveRestaurant(Restaurant r) {
		dao.saveRestaurant(r);
	}
	
	public List<Restaurant> getRestaurantList(){
		return dao.getRestaurantList();
	}
}
