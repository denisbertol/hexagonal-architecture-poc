package br.com.dbsystems.gmp.persistence.jpa.repository;

import br.com.dbsystems.gmp.domain.model.Midia;
import br.com.dbsystems.gmp.persistence.jpa.entity.MidiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MidiaRepository extends JpaRepository<MidiaEntity, Integer> {

}
