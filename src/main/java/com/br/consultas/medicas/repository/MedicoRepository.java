package com.br.consultas.medicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.consultas.medicas.model.Medico;

public interface MedicoRepository extends JpaRepository < Medico, Long> {
    
}
