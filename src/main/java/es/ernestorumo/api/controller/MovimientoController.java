package es.ernestorumo.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import es.ernestorumo.api.domain.MovimientoEntity;
import es.ernestorumo.api.service.MovimientoService;

@RestController
@RequestMapping("/api/v1/movimientos")
public class MovimientoController implements MovimientoOperation {

	@Autowired
	private MovimientoService movimientoService;
	
	@Override
	@GetMapping(value = "", produces = "application/json")
	public List<MovimientoEntity> obtenerListaMovimientos() {
		
		return this.movimientoService.findAll();
	}

	@Override
	@PostMapping(value = "", produces = {"application/json"}, consumes = {"application/json"})
	public MovimientoEntity crearMovimiento(@RequestBody MovimientoEntity movimiento) {
		
		return this.movimientoService.save(movimiento);
	}

	@Override
	@GetMapping(value = "/{id}", produces = {"application/json"})
	public MovimientoEntity obtenerMovimiento(@PathVariable("id") Integer id) {
		
		return this.movimientoService.findById(id).orElseThrow(()-> new ResponseStatusException(
          HttpStatus.NOT_FOUND, "Movimiento no encontrado"));		
	}

	@Override
	@DeleteMapping(value = "/{id}", produces = {"application/json"})
	public MovimientoEntity borrarMovimiento(@PathVariable("id") Integer id) {
		
		MovimientoEntity movimiento = this.movimientoService.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Movimiento no encontrado"));
		
		this.movimientoService.deleteById(movimiento);
		
		return movimiento;
	}
	
	@Override
	@PutMapping(value = "/{id}", produces = {"application/json"})
	public MovimientoEntity modificarMovimiento(@PathVariable("id") Integer id, @RequestBody MovimientoEntity movimiento) {
		
		MovimientoEntity movimientoBD = this.movimientoService.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Movimiento no encontrado"));
		
		movimiento.setId(movimientoBD.getId());
		
		this.movimientoService.save(movimiento);
		
		return movimientoBD;
	}
	
	
}
