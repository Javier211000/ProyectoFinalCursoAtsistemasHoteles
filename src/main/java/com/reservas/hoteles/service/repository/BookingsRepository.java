package com.reservas.hoteles.service.repository;

import java.util.List;
import com.reservas.hoteles.model.Bookings;

public interface BookingsRepository {
	
	List<Bookings> findAll();
	
	Bookings insert(Bookings bookings);
	
	Bookings update(Integer id);
	
	Bookings findById(Integer id);
	
}