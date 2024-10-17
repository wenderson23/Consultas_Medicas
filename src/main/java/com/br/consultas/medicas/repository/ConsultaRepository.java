package com.br.consultas.medicas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.consultas.medicas.model.Consulta;
import com.br.consultas.medicas.model.Medico;
import com.br.consultas.medicas.model.Paciente;

public interface ConsultaRepository extends JpaRepository < Consulta, Long> {
    List<Consulta> findByPaciente(Paciente Paciente);

    List<Consulta> findByMedico( Medico medico);
}
