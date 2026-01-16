package com.ittopdogs.certicoach.service;

import com.ittopdogs.certicoach.persistence.Antwoord;
import com.ittopdogs.certicoach.persistence.Vraag;
import com.ittopdogs.certicoach.persistence.repository.AntwoordRepository;
import com.ittopdogs.certicoach.persistence.repository.VraagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VraagService {

    @Autowired
    private VraagRepository vraagRepository;
    @Autowired
    private AntwoordRepository antwoordRepository;

    @Transactional
    @PreAuthorize("hasRole('USER')")
    public List<Vraag> getAlleVragen() {
        return vraagRepository.findAll();
    }

    public List<Antwoord> getAntwoordenBijVraag(Long vraagId) {
        return antwoordRepository.findByVraagId(vraagId);
    }
}
