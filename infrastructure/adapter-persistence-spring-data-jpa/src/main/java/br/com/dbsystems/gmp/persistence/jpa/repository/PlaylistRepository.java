package br.com.dbsystems.gmp.persistence.jpa.repository;

import br.com.dbsystems.gmp.domain.model.Playlist;
import br.com.dbsystems.gmp.persistence.jpa.entity.PlaylistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<PlaylistEntity, Integer> {

}
