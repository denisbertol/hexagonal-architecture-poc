package br.com.dbsystems.gmp.application.service.adapter;

import br.com.dbsystems.gmp.application.service.api.MidiaService;
import br.com.dbsystems.gmp.domain.model.Midia;
import br.com.dbsystems.gmp.domain.spi.MidiaPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MidiaServiceAdapter implements MidiaService {

    private MidiaPersistencePort midiaPersistencePort;

    @Autowired
    public MidiaServiceAdapter(MidiaPersistencePort midiaPersistencePort) {
        this.midiaPersistencePort = midiaPersistencePort;
    }

    @Override
    public void addMidia(Midia midia) {
        midiaPersistencePort.addMidia(midia);
    }

    @Override
    public void removeMidia(Midia midia) {
        midiaPersistencePort.removeMidia(midia);
    }

    @Override
    public List<Midia> getMidias() {
        return midiaPersistencePort.getMidias();
    }

    @Override
    public Midia getMidiaById(Integer midiaId) {
        return midiaPersistencePort.getMidiaById(midiaId);
    }
}
