package br.com.dbsystems.gmp.infrastructure.persistence.inmemory.config;

import br.com.dbsystems.gmp.domain.spi.MidiaPersistencePort;
import br.com.dbsystems.gmp.domain.spi.PlaylistPersistencePort;
import br.com.dbsystems.gmp.infrastructure.persistence.inmemory.adapter.MidiaInMemoryAdapter;
import br.com.dbsystems.gmp.infrastructure.persistence.inmemory.adapter.PlaylistInMemoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InMemoryAdapterConfiguration {

    @Bean
    public MidiaPersistencePort getMidiaPersistencePort() {
        return new MidiaInMemoryAdapter();
    }

    @Bean
    public PlaylistPersistencePort getPlaylistPersistencePort() {
        return new PlaylistInMemoryAdapter();
    }
}
