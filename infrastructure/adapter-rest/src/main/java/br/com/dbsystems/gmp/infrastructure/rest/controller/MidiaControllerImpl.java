package br.com.dbsystems.gmp.infrastructure.rest.controller;

import br.com.dbsystems.gmp.application.service.api.MidiaService;
import br.com.dbsystems.gmp.domain.model.Midia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MidiaControllerImpl implements MidiaController {

    private MidiaService midiaService;

    @Autowired
    public MidiaControllerImpl(MidiaService midiaService) {
        this.midiaService = midiaService;
    }

    @Override
    public ResponseEntity<List<Midia>> getMidias() {
        return new ResponseEntity<List<Midia>>(midiaService.getMidias(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> addMidia(Midia midia) {
        midiaService.addMidia(midia);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> removeMidia(Midia midia) {
        midiaService.removeMidia(midia);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Midia> getMidiaById(Integer midiaId) {
        return new ResponseEntity<Midia>(midiaService.getMidiaById(midiaId), HttpStatus.OK);
    }
}
