package es.ernestorumo.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import es.ernestorumo.api.domain.MovimientoEntity;

public interface MovimientoOperation {

	
	List<MovimientoEntity> obtenerListaMovimientos();
	
	MovimientoEntity crearMovimiento(MovimientoEntity movimiento);
	
	MovimientoEntity obtenerMovimiento(Integer id);
	
	MovimientoEntity borrarMovimiento(Integer id);
	
	MovimientoEntity modificarMovimiento(@PathVariable("id") Integer id, @RequestBody MovimientoEntity movimiento);
	
}
