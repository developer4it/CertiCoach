package com.ittopdogs.certicoach.controller.repositorycontroller;
import com.ittopdogs.certicoach.persistence.Antwoord;
import com.ittopdogs.certicoach.persistence.Vraag;
import com.ittopdogs.certicoach.service.VraagService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/vragen")
public class VraagController {

    @Autowired
    private VraagService vraagService;

    @GetMapping
    public List<Vraag> alleVragen() {
        return vraagService.getAlleVragen();
    }

    @GetMapping("/{id}/antwoorden")
    public List<Antwoord> antwoordenVoorVraag(@PathVariable Long id) {
        return vraagService.getAntwoordenBijVraag(id);
    }
}