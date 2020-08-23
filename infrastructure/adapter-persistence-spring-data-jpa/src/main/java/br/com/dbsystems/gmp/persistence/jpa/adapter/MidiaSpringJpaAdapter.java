package br.com.dbsystems.gmp.persistence.jpa.adapter;

import br.com.dbsystems.gmp.domain.model.Midia;
import br.com.dbsystems.gmp.domain.spi.MidiaPersistencePort;
import br.com.dbsystems.gmp.persistence.jpa.entity.MidiaEntity;
import br.com.dbsystems.gmp.persistence.jpa.repository.MidiaRepository;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MidiaSpringJpaAdapter implements MidiaPersistencePort {

    private MidiaRepository midiaRepository;

    public MidiaSpringJpaAdapter(MidiaRepository midiaRepository) {
        this.midiaRepository = midiaRepository;
    }

    @Override
    public void addMidia(Midia midia) {
        MidiaEntity midiaEntity = new MidiaEntity();
        BeanUtils.copyProperties(midia, midiaEntity);
        midiaRepository.save(midiaEntity);
    }

    @Override
    public void removeMidia(Midia midia) {
        MidiaEntity midiaEntity = new MidiaEntity();
        BeanUtils.copyProperties(midia, midiaEntity);
        midiaRepository.delete(midiaEntity);
    }

    @Override
    public List<Midia> getMidias() {
        List<Midia> midiaList = new ArrayList<Midia>();
        List<MidiaEntity> midiaEntityList = midiaRepository.findAll();
        for(MidiaEntity midiaEntity : midiaEntityList) {
            Midia midia = new Midia();
            BeanUtils.copyProperties(midiaEntity, midia);
            midiaList.add(midia);
        }
        return midiaList;
    }

    @Override
    public Midia getMidiaById(Integer midiaId) {
        MidiaEntity midiaEntity = midiaRepository.findById(midiaId).get();
        if (midiaEntity == null) {
            // throw new MidiaNotFoundException
        }
        Midia midia = new Midia();
        BeanUtils.copyProperties(midiaEntity, midia);

        return midia;
    }
}
