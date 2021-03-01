package es.ernestorumo.api.domain;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MovimientoEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "IMPORTE", nullable = false, precision=10, scale=2)
	private Double importe;
	
	@Column(name = "FECHA", nullable = false)
	private LocalDateTime fecha;
	
	@Column(name = "DESCRIPCION", length = 255)
	private String descripcion;
}
