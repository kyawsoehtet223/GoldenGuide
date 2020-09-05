package com.best.goldenguide.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class City implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "state_id")
	private State state=new State();
	
	@OneToMany(mappedBy="city", cascade=CascadeType.ALL)
	private Set<Place> placeList;
	
	private String description;
	private String url;
	
	public City() {
		
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
	public Set<Place> getPlaceList() {
		return placeList;
	}

	public void setPlaceList(Set<Place> placeList) {
		this.placeList = placeList;
	}

	public City(Long id, String name, State state, String description, String url) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.description = description;
		this.url = url;
	}

	public City(String name, State state, String description, String url) {
		super();
		this.name = name;
		this.state = state;
		this.description = description;
		this.url = url;
	}
	
}
