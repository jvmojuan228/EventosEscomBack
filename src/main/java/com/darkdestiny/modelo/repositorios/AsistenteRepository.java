package com.darkdestiny.modelo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.darkdestiny.modelo.entidades.Asistente;
import com.darkdestiny.modelo.entidades.Evento;

public interface AsistenteRepository extends JpaRepository<Asistente, Long>{

	@Query("from Evento")
	public List<Evento> findAllEventos();
	
}
