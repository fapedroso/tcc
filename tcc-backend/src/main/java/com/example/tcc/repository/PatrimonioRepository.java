package com.example.tcc.repository;

import com.example.tcc.model.Patrimonio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatrimonioRepository extends JpaRepository<Patrimonio, Long> {
    Page<Patrimonio> findAllByAtivoTrue(Pageable paginacao);
}
