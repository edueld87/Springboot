package com.entra21.eventoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entra21.eventoapp.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, String> {

	Evento findByCodigo(long codigo);

}
