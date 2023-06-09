package com.reservas.hoteles.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "hotels")
public class Hotels {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column (name = "nombre", length = 20, nullable = false)
	private String name;
	
	@Column (name = "categoria", length = 4, nullable = false)
	private Integer category;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hotels")
	private List<Availabilities> availabilities;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hotels")
	private List<Bookings> bookings;

	public Hotels() {
		super();
	}

	public Hotels(Integer id, String name, Integer category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}
}