package com.reservas.hoteles.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.reservas.hoteles.model.Hotels;
import com.reservas.hoteles.service.HotelsService;
import com.reservas.hoteles.service.repository.HotelsRepository;

@Service
public class HotelsServiceImpl implements HotelsService {
	
	private HotelsRepository hotelsRepository;

	public HotelsServiceImpl(HotelsRepository hotelsRepository) {
		this.hotelsRepository = hotelsRepository;
	}

	@Override
	public List<Hotels> listadoHotels() {
		return hotelsRepository.consultaHoteles();
	}
}