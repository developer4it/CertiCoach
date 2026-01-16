package com.ittopdogs.certicoach.persistence.repository;

import com.ittopdogs.certicoach.persistence.Antwoord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AntwoordRepository extends JpaRepository<Antwoord, Long> {
    List<Antwoord> findByVraagId(Long vraagId);
}