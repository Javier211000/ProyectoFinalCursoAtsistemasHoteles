package com.reservas.hoteles.service.repository.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.reservas.hoteles.model.Hotels;
import com.reservas.hoteles.service.repository.HotelsRepository;

@Repository
public class JpaHotelsRepository implements HotelsRepository{
	
	@PersistenceContext
	private EntityManager em;

	public JpaHotelsRepository() {
		
	}

	@Override
	public Hotels crearHotel(Hotels hotels) {
		return em.find(Hotels.class, hotels);
	}

	@Override
	public Integer actualizarHotel(Integer id) {
		em.persist(id);
		return id;
	}

	@Override
	public Integer consultarHotel(Integer id) {
		em.merge(id);
		return id;
	}
	
	@Override
	public List<Hotels> consultaHoteles() {
		return em.createQuery("FROM Hotels", Hotels.class).getResultList();
	}

}