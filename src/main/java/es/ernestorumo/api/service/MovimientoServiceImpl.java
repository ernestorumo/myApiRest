package es.ernestorumo.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.ernestorumo.api.domain.MovimientoEntity;
import es.ernestorumo.api.repository.MovimientoRepository;

@Service
public class MovimientoServiceImpl implements MovimientoService{

	@Autowired
	MovimientoRepository movimientoRepository;

	@Override
	public List<MovimientoEntity> findAll() {
		return movimientoRepository.findAll();
	}

	@Override
	public MovimientoEntity save(MovimientoEntity movimiento) {
		return this.movimientoRepository.save(movimiento);
		
	}

	@Override
	public Optional<MovimientoEntity> findById(Integer id) {
		return this.movimientoRepository.findById(id);
	}

	@Override
	public Optional<MovimientoEntity> deleteById(MovimientoEntity movimiento) {
		this.movimientoRepository.delete(movimiento);
		
		return Optional.of(movimiento);
		
	}
}
