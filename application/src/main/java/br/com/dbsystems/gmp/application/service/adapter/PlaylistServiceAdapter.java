package br.com.dbsystems.gmp.application.service.adapter;

import br.com.dbsystems.gmp.application.service.api.PlaylistService;
import br.com.dbsystems.gmp.domain.model.Playlist;
import br.com.dbsystems.gmp.domain.spi.PlaylistPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PlaylistServiceAdapter implements PlaylistService {

    private PlaylistPersistencePort playlistPersistencePort;

    @Autowired
    public PlaylistServiceAdapter(PlaylistPersistencePort playlistPersistencePort) {
        this.playlistPersistencePort = playlistPersistencePort;
    }

    @Override
    public void addPlaylist(Playlist playlist) {
        playlistPersistencePort.addPlaylist(playlist);
    }

    @Override
    public void removePlaylist(Integer playlistId) {
        playlistPersistencePort.removePlaylist(playlistId);
    }

    @Override
    public List<Playlist> getPlaylists() {
        return playlistPersistencePort.getPlaylists();
    }

    @Override
    public Playlist getPlaylistById(Integer playlistId) {
        return playlistPersistencePort.getPlaylistById(playlistId);
    }
}
