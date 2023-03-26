package com.reservas.hoteles.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.reservas.hoteles.model.Bookings;
import com.reservas.hoteles.service.BookingsService;
import com.reservas.hoteles.service.repository.BookingsRepository;

@Service
public class BookingsServiceImpl implements BookingsService {
	
	private BookingsRepository bookingsRepository;

	public BookingsServiceImpl(BookingsRepository bookingsRepository) {
		this.bookingsRepository = bookingsRepository;
	}

	@Override
	public List<Bookings> listadoBookings() {
		return bookingsRepository.findAll();
	}
}