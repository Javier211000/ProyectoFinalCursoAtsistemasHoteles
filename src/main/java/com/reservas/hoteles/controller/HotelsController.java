package com.reservas.hoteles.controller;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reservas.hoteles.model.Hotels;
import com.reservas.hoteles.service.HotelsService;

@RestController
@RequestMapping("hotels")
public class HotelsController {
	
		private HotelsService hotelsService;

		public HotelsController(HotelsService hotelsService) {
			this.hotelsService = hotelsService;
		}

		@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Hotels> listarHotels() {
			return hotelsService.listadoHotels();
		}
}