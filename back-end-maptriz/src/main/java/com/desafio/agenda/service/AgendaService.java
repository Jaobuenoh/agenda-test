package com.desafio.agenda.service;

import com.desafio.agenda.model.Contato;
import com.desafio.agenda.repository.AgendaRepository;

import java.util.List;

public class AgendaService {

    private final AgendaRepository agendaRepository;

    public AgendaService(AgendaRepository agendaRepository) {
        this.agendaRepository = agendaRepository;
    }

    public Contato findyById(Long id) {
        return agendaRepository.findById(id).orElse(null);
    }

    public List<Contato> findAll() {
        return agendaRepository.findAll();
    }

    public Contato save(Contato contato) {
        return agendaRepository.save(contato);
    }

    public void delete(Contato contato) {
        agendaRepository.delete(contato);
    }
}
