package br.com.dbsystems.gmp.persistence.jpa.config;

import br.com.dbsystems.gmp.domain.spi.MidiaPersistencePort;
import br.com.dbsystems.gmp.domain.spi.PlaylistPersistencePort;
import br.com.dbsystems.gmp.persistence.jpa.adapter.MidiaSpringJpaAdapter;
import br.com.dbsystems.gmp.persistence.jpa.adapter.PlaylistSpringJpaAdapter;
import br.com.dbsystems.gmp.persistence.jpa.repository.MidiaRepository;
import br.com.dbsystems.gmp.persistence.jpa.repository.PlaylistRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDataJpaAdapterConfiguration {

    @Bean
    public MidiaPersistencePort getMidiaPersistencePort(MidiaRepository midiaRepository) {
        return new MidiaSpringJpaAdapter(midiaRepository);
    }

    @Bean
    public PlaylistPersistencePort getPlaylistPersistencePort(PlaylistRepository playlistRepository) {
        return new PlaylistSpringJpaAdapter(playlistRepository);
    }
}
