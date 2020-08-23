package br.com.dbsystems.gmp.domain.spi;

import br.com.dbsystems.gmp.domain.model.Midia;
import br.com.dbsystems.gmp.domain.model.Playlist;

import java.util.List;

public interface PlaylistPersistencePort {

    void addPlaylist(Playlist playlist);

    void removePlaylist(Integer playlistId);

    List<Playlist> getPlaylists();

    Playlist getPlaylistById(Integer playlistId);
}
