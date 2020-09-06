package com.goldenguide.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goldenguide.dao.GoldenGuideDao;
import com.goldenguide.model.State;



@Service
@Transactional

public class GoldenGuideService {
	public List<State> getStateList(){
		System.out.println("Show State List");
		return GoldenGuideDao.getStateList();
	}

}
