package com.ittopdogs.certicoach.persistence;

import jakarta.persistence.*;

@Entity
public class Vraag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vraagtekst;

    // Geen Set<Antwoord> meer!

    // Constructors, getters, setters
    public Long getId() { return id; }
    public String getVraagtekst() { return vraagtekst; }
    public void setVraagtekst(String vraagtekst) { this.vraagtekst = vraagtekst; }
}