package com.entra21.eventoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entra21.eventoapp.models.Convidado;
import com.entra21.eventoapp.models.Evento;

public interface ConvidadoRepository extends JpaRepository<Convidado, String>{

		Iterable<Convidado>findByEvento(Evento evento);
}
