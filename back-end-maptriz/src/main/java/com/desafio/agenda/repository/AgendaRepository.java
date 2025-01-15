package com.desafio.agenda.repository;

import com.desafio.agenda.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Contato, Long> {
}
