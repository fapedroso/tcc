package com.example.tcc.repository;

import com.example.tcc.model.Patrimonio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatrimonioRepository extends JpaRepository<Patrimonio, Long> {
}
