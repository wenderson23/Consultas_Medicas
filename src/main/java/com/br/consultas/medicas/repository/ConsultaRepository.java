package com.br.consultas.medicas.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.br.consultas.medicas.model.Consulta;

public interface ConsultaRepository extends JpaRepository < Consulta, Long> {
   
}
