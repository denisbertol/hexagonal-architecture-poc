package br.com.dbsystems.gmp.infrastructure.persistence.inmemory.adapter;

import br.com.dbsystems.gmp.domain.model.Midia;
import br.com.dbsystems.gmp.domain.model.Playlist;
import br.com.dbsystems.gmp.domain.spi.PlaylistPersistencePort;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PlaylistInMemoryAdapter implements PlaylistPersistencePort {

    private static final Map<Integer, Playlist> playlistMap = new HashMap<Integer, Playlist>(0);

    @Override
    public void addPlaylist(Playlist playlist) {
        playlist.setId(ThreadLocalRandom.current().nextInt());
        for (Midia midia : playlist.getMidias()) {
            midia.setId(ThreadLocalRandom.current().nextInt());
        }
        playlistMap.put(playlist.getId(), playlist);
    }

    @Override
    public void removePlaylist(Playlist playlist) {
        playlistMap.remove(playlist);
    }

    @Override
    public List<Playlist> getPlaylists() {
        return new ArrayList<Playlist>(playlistMap.values());
    }

    @Override
    public Playlist getPlaylistById(Integer playlistId) {
        return playlistMap.get(playlistId);
    }
}
