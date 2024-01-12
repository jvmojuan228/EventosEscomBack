package com.darkdestiny.modelo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.darkdestiny.modelo.entidades.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
	@Query("select e from Evento e where e.nombreEvento like %?1%")
	public List<Evento> findByNombre(String nombre);
}
