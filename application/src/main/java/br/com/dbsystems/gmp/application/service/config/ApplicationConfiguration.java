package br.com.dbsystems.gmp.application.service.config;

import br.com.dbsystems.gmp.application.service.adapter.MidiaServiceAdapter;
import br.com.dbsystems.gmp.application.service.adapter.PlaylistServiceAdapter;
import br.com.dbsystems.gmp.application.service.api.MidiaService;
import br.com.dbsystems.gmp.application.service.api.PlaylistService;
import br.com.dbsystems.gmp.domain.spi.MidiaPersistencePort;
import br.com.dbsystems.gmp.domain.spi.PlaylistPersistencePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public MidiaService getMidiaService(MidiaPersistencePort midiaPersistencePort) {
        return new MidiaServiceAdapter(midiaPersistencePort);
    }

    @Bean
    public PlaylistService getPlaylistService(PlaylistPersistencePort playlistPersistencePort) {
        return new PlaylistServiceAdapter(playlistPersistencePort);
    }
}
