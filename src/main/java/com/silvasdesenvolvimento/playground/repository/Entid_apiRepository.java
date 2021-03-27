package com.silvasdesenvolvimento.playground.repository;

import com.silvasdesenvolvimento.playground.repository.entity.Entid_api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
JpaRepository<seuObjetoDoBanco, TypoDoIdNoBanco>
 */
@Repository
public interface Entid_apiRepository extends JpaRepository<Entid_api, Long> {
}
