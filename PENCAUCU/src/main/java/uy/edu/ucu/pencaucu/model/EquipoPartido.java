package uy.edu.ucu.pencaucu.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "equipo_partido")
public class EquipoPartido {

	@Id
	@Column(name = "id_equipo_partido")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_equipo_partido;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "id_partido")
	private Partido partido;
	
	@ManyToOne
	@JoinColumn(name = "id_equipo")
	private Equipo equipo;
	
	// Asocia un numero al equipo (1 o 2) para relacionarlo con las predicciones.
	@Column(name = "tipo_equipo")
	private Integer tipo_equipo;
}
