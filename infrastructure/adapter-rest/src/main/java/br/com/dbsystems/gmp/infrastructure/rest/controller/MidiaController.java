package br.com.dbsystems.gmp.infrastructure.rest.controller;


import br.com.dbsystems.gmp.domain.model.Midia;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface MidiaController {

    @GetMapping("/midia")
    ResponseEntity<List<Midia>> getMidias();

    @PostMapping("/midia")
    ResponseEntity<Void> addMidia(@RequestBody Midia midia);

    @DeleteMapping("/midia")
    ResponseEntity<Void> removeMidia(@RequestBody Midia midia);

    @GetMapping("/midia/{midiaId}")
    ResponseEntity<Midia> getMidiaById(@PathVariable Integer midiaId);
}
