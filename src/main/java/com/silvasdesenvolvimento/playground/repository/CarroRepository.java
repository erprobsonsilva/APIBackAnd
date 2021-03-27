package com.silvasdesenvolvimento.playground.repository;

import com.silvasdesenvolvimento.playground.repository.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
JpaRepository<seuObjetoDoBanco, TypoDoIdNoBanco>
 */
@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
}
