package br.com.dbsystems.gmp.infrastructure.persistence.inmemory.adapter;

import br.com.dbsystems.gmp.domain.model.Midia;
import br.com.dbsystems.gmp.domain.spi.MidiaPersistencePort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class MidiaInMemoryAdapter implements MidiaPersistencePort {

    private static final Map<Integer, Midia> midiaMap = new HashMap<Integer, Midia>(0);

    @Override
    public void addMidia(Midia midia) {
        midiaMap.put(ThreadLocalRandom.current().nextInt(), midia);
    }

    @Override
    public void removeMidia(Midia midia) {
        midiaMap.remove(midia);
    }

    @Override
    public List<Midia> getMidias() {
        return new ArrayList<Midia>(midiaMap.values());
    }

    @Override
    public Midia getMidiaById(Integer midiaId) {
        return midiaMap.get(midiaId);
    }
}
