package es.ernestorumo.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import es.ernestorumo.api.domain.MovimientoEntity;


public interface MovimientoService {

	List<MovimientoEntity> findAll();
	
	MovimientoEntity save(MovimientoEntity movimiento);
	
	Optional<MovimientoEntity> findById(Integer id);
	
	Optional<MovimientoEntity> deleteById(MovimientoEntity movimiento);
	
}
