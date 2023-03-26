package com.reservas.hoteles.controller;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reservas.hoteles.model.Availabilities;
import com.reservas.hoteles.service.AvailabilitiesService;

@RestController
@RequestMapping("availabilities")
public class AvailabilitiesController {
	
	private AvailabilitiesService availabilitiesService;

	public AvailabilitiesController(AvailabilitiesService availabilitiesService) {
		this.availabilitiesService = availabilitiesService;
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Availabilities> listarAvailabilities() {
		return availabilitiesService.listadoAvailabilities();
	}
}