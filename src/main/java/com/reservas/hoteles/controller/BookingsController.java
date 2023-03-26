package com.reservas.hoteles.controller;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reservas.hoteles.model.Bookings;
import com.reservas.hoteles.service.BookingsService;

@RestController
@RequestMapping("bookings")
public class BookingsController {
	
	private BookingsService bookingsService;

	public BookingsController(BookingsService bookingsService) {
		this.bookingsService = bookingsService;
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Bookings> listarBookings() {
		return bookingsService.listadoBookings();
	}
}