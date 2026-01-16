package com.ittopdogs.certicoach;

import com.ittopdogs.certicoach.persistence.Antwoord;
import com.ittopdogs.certicoach.persistence.Vraag;
import com.ittopdogs.certicoach.persistence.repository.AntwoordRepository;
import com.ittopdogs.certicoach.persistence.repository.VraagRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@ActiveProfiles("test")
@DataJpaTest // Spring Boot zal in-memory database opzetten
class VraagAntwoordRepositoryTest {

    @Autowired
    private VraagRepository vraagRepository;

    @Autowired
    private AntwoordRepository antwoordRepository;
/*
    @Test
    void vraagEnAntwoordenWordenOpgeslagenEnGevonden() {
        // 1. Maak een Vraag-entiteit
        Vraag vraag = new Vraag();
        vraag.setVraagtekst("Wat is de hoofdstad van Nederland?");
        vraag = vraagRepository.save(vraag);

        // 2. Voeg een paar antwoorden toe
        Antwoord a1 = new Antwoord();
        a1.setTekst("Rotterdam");
        a1.setCorrect(false);
        a1.setVraag(vraag);

        Antwoord a2 = new Antwoord();
        a2.setTekst("Amsterdam");
        a2.setCorrect(true);
        a2.setVraag(vraag);

        antwoordRepository.save(a1);
        antwoordRepository.save(a2);

        // 3. Zoekt de vraag op
        Vraag gevondenVraag = vraagRepository.findById(vraag.getId()).orElseThrow();
        assertThat(gevondenVraag.getVraagtekst()).isEqualTo("Wat is de hoofdstad van Nederland?");

        // 4. Haal de juiste antwoorden op
        List<Antwoord> antwoorden = antwoordRepository.findByVraagId(vraag.getId());
        assertThat(antwoorden).hasSize(2);
        assertThat(
                antwoorden.stream().anyMatch(a -> a.getTekst().equals("Amsterdam") && a.isCorrect())
        ).isTrue();
    }

 */
}