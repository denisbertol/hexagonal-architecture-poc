package br.com.dbsystems.gmp.application.service.api;

import br.com.dbsystems.gmp.domain.model.Midia;

import java.util.List;

public interface MidiaService {

    void addMidia(Midia midia);

    void removeMidia(Midia midia);

    List<Midia> getMidias();

    Midia getMidiaById(Integer midiaId);

}
