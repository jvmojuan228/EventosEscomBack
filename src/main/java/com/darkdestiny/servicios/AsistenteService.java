package com.darkdestiny.servicios;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.darkdestiny.modelo.entidades.Asistente;
import com.darkdestiny.modelo.entidades.Evento;

public interface AsistenteService {

	public List<Asistente> findAll();
	public Page<Asistente> findAll(Pageable pageable);
	public Asistente findById(Long id);
	public Asistente save(Asistente asistente);
	public void delete(Long id);

	//Recuperar las Categorias
	public List<Evento> findAllEvento();
	
	public ByteArrayInputStream reporteAsistente(List<Asistente> asistentes);
	
}
