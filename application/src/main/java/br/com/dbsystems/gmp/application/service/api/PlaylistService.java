package br.com.dbsystems.gmp.application.service.api;

import br.com.dbsystems.gmp.domain.model.Midia;
import br.com.dbsystems.gmp.domain.model.Playlist;

import java.util.List;

public interface PlaylistService {

    void addPlaylist(Playlist playlist);

    void removePlaylist(Integer playlist);

    List<Playlist> getPlaylists();

    Playlist getPlaylistById(Integer playlistId);
}
