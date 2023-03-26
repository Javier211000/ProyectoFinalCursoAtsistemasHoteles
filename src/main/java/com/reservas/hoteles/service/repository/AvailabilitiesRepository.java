package com.reservas.hoteles.service.repository;

import java.util.List;
import com.reservas.hoteles.model.Availabilities;

public interface AvailabilitiesRepository {

	List<Availabilities> findAll();
	
	Availabilities insert(Availabilities availabilities);
	
	Availabilities update(Integer id);
	
	Availabilities findById(Integer id);
	
}