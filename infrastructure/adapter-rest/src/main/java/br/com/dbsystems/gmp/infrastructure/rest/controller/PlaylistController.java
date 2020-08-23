package br.com.dbsystems.gmp.infrastructure.rest.controller;


import br.com.dbsystems.gmp.domain.model.Playlist;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface PlaylistController {

    @GetMapping("/playlists")
    ResponseEntity<List<Playlist>> getPlaylists();

    @PostMapping("/playlists")
    ResponseEntity<Playlist> addPlaylist(@RequestBody Playlist playlist);

    @DeleteMapping("/playlists/{playlistId}")
    ResponseEntity<Playlist> removePlaylist(@PathVariable Integer playlistId);

    @GetMapping("/playlists/{playlistId}")
    ResponseEntity<Playlist> getPlaylistById(@PathVariable Integer playlistId);
}
