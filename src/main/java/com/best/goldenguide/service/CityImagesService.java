package com.best.goldenguide.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best.goldenguide.dao.CityImagesDao;
import com.best.goldenguide.dao.PlaceDao;
import com.best.goldenguide.dto.CityImagesDto;
import com.best.goldenguide.dto.PlaceDto;
import com.best.goldenguide.model.CityImages;
import com.best.goldenguide.model.Place;

@Transactional
@Service
public class CityImagesService {
	@Autowired
	ServletContext serveletContext;
	@Autowired
	CityImagesDao cityImagesDao;
	public String UPLOAD_DIRECTORY = "/images";
	
	public void saveCityImages(CityImagesDto ci) {

		// ServletContext context = session.getServletContext();
		if ( ci != null) {
			String path = serveletContext.getRealPath(UPLOAD_DIRECTORY);
			String filename = ci.getFile().getOriginalFilename();

			System.out.println(path + " " + filename);
			try {
				byte[] bytes =  ci.getFile().getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(new File(path + File.separator + filename)));
				stream.write(bytes);
				stream.flush();
				stream.close();

			} catch (Exception e) {
				System.out.println(e);
			}
			
			CityImages cimage=new CityImages(0L, filename);
			cityImagesDao.saveCityImages(cimage);
		}

	}

	public List<CityImages> getCityImagesList() {
		return cityImagesDao.getCityImagesList();
	}
}
