package com.br.consultas.medicas.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.br.consultas.medicas.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    
}
