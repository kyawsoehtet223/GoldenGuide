package com.best.goldenguide.dto;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.web.multipart.MultipartFile;

import com.best.goldenguide.model.State;

public class CityDTO {

	private Long id;
	private String name;
	
	@OneToOne
	@JoinColumn(name = "state_id")
	private State state=new State();
	private String description;
	private String url;
	private MultipartFile file;
	
	public CityDTO() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
}
