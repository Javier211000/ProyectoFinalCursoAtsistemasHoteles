package com.reservas.hoteles.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.reservas.hoteles.model.Availabilities;
import com.reservas.hoteles.service.AvailabilitiesService;
import com.reservas.hoteles.service.repository.AvailabilitiesRepository;

@Service
public class AvailabilitiesServiceImpl implements AvailabilitiesService{
	
	private AvailabilitiesRepository availabilitiesRepository;

	public AvailabilitiesServiceImpl(AvailabilitiesRepository availabilitiesRepository) {
		this.availabilitiesRepository = availabilitiesRepository;
	}

	@Override
	public List<Availabilities> listadoAvailabilities() {
		return availabilitiesRepository.findAll();
	}
}