package com.best.goldenguide.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best.goldenguide.dao.PlaceDao;
import com.best.goldenguide.dto.PlaceDto;
import com.best.goldenguide.model.Place;

@Transactional
@Service
public class PlaceService {
	@Autowired
	ServletContext serveletContext;
	@Autowired
	PlaceDao placeDao;
	public String UPLOAD_DIRECTORY = "/images";

	public void savePlace(PlaceDto place) {

		// ServletContext context = session.getServletContext();
		if (place != null) {
			String path = serveletContext.getRealPath(UPLOAD_DIRECTORY);
			String filename = place.getFile().getOriginalFilename();

			System.out.println(path + " " + filename);
			try {
				byte[] bytes = place.getFile().getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(new File(path + File.separator + filename)));
				stream.write(bytes);
				stream.flush();
				stream.close();

			} catch (Exception e) {
				System.out.println(e);
			}
			
			Place p = new Place(0L, place.getName(), place.getType(), filename, place.getLocation(), place.getDescription());
			placeDao.savePlace(p);
		}

	}

	public List<Place> getPlaceList() {
		return placeDao.getPlaceList();
	}
}
