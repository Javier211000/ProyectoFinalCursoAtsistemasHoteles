package com.reservas.hoteles.service.repository;

import java.util.List;
import com.reservas.hoteles.model.Hotels;

public interface HotelsRepository {
	
	Hotels crearHotel(Hotels hotels);
	
	Integer actualizarHotel(Integer id);
	
	Integer consultarHotel(Integer id);
	
	List<Hotels> consultaHoteles();

}