package br.com.dbsystems.gmp.infrastructure.rest.controller;

import br.com.dbsystems.gmp.application.service.api.PlaylistService;
import br.com.dbsystems.gmp.domain.model.Playlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlaylistControllerImpl implements PlaylistController {

    private PlaylistService playlistService;

    @Autowired
    public PlaylistControllerImpl(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @Override
    public ResponseEntity<List<Playlist>> getPlaylists() {
        return new ResponseEntity<List<Playlist>>(playlistService.getPlaylists(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Playlist> addPlaylist(Playlist playlist) {
        playlistService.addPlaylist(playlist);
        return new ResponseEntity<Playlist>(playlist,HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Playlist> removePlaylist(Integer playlistId) {
        playlistService.removePlaylist(playlistId);
        return new ResponseEntity<Playlist>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Playlist> getPlaylistById(Integer playlistId) {
        return new ResponseEntity<Playlist>(playlistService.getPlaylistById(playlistId), HttpStatus.OK);
    }
}
