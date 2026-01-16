package com.ittopdogs.certicoach.persistence;

import jakarta.persistence.*;

@Entity
public class Antwoord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vraag_id")
    private Vraag vraag;

    private String tekst;
    private boolean correct; // True als correct antwoord

    public void setTekst(String rotterdam) {
    }

    // Getters en setters
}
