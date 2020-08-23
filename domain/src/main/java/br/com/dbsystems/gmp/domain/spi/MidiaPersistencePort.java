package br.com.dbsystems.gmp.domain.spi;

import br.com.dbsystems.gmp.domain.model.Midia;

import java.util.List;

public interface MidiaPersistencePort {

    void addMidia(Midia midia);

    void removeMidia(Midia midia);

    List<Midia> getMidias();

    Midia getMidiaById(Integer midiaId);
}
