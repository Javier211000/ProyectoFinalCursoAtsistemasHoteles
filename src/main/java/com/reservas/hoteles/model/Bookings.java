package com.reservas.hoteles.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "bookings")
public class Bookings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_hotels", nullable = false)
	private Hotels hotels;
	
	@Column (name = "fecha_de", nullable = false)
	private Date date_from;
	
	@Column (name = "fecha_hasta", nullable = false)
	private Date date_to;

	@Column (name = "Email", length = 20, nullable = false)
	private String email;

	public Bookings() {
		super();
	}

	public Bookings(Integer id, Date date_from, Date date_to, String email) {
		super();
		this.id = id;
		this.date_from = date_from;
		this.date_to = date_to;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate_from() {
		return date_from;
	}

	public void setDate_from(Date date_from) {
		this.date_from = date_from;
	}

	public Date getDate_to() {
		return date_to;
	}

	public void setDate_to(Date date_to) {
		this.date_to = date_to;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
}