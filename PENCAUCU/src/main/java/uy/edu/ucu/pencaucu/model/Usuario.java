package uy.edu.ucu.pencaucu.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Integer id_usuario;
	
	@Column(name = "email", length=100, nullable=false, unique=true)
	private String email;

	@Column(name = "contrasenia", length=60, nullable=false)
	private String contrasenia;

	@Column(name = "nombre", length=50, nullable=false)
	private String nombre;

	@Column(name = "apellido", length=50)
	private String apellido;

	@Column(name = "avatar_path", length=50)
	private String avatar_path;
	
	@ManyToOne
	@JoinColumn(name="id_carrera", nullable=false)
	private Carrera carrera;
	
	@Column(name="es_administrador")
	private Boolean es_administrador;
	
	@OneToMany(mappedBy = "id_usuario")
	private List<Prediccion> predicciones;
	
	@OneToMany(mappedBy = "usuario")
	private List<TorneoUsuario> torneos;
}
