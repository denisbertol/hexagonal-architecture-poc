package br.com.dbsystems.gmp.persistence.jpa.adapter;

import br.com.dbsystems.gmp.domain.model.Midia;
import br.com.dbsystems.gmp.domain.model.Playlist;
import br.com.dbsystems.gmp.domain.spi.PlaylistPersistencePort;
import br.com.dbsystems.gmp.persistence.jpa.entity.MidiaEntity;
import br.com.dbsystems.gmp.persistence.jpa.entity.PlaylistEntity;
import br.com.dbsystems.gmp.persistence.jpa.repository.MidiaRepository;
import br.com.dbsystems.gmp.persistence.jpa.repository.PlaylistRepository;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlaylistSpringJpaAdapter implements PlaylistPersistencePort {

    private PlaylistRepository playlistRepository;

    public PlaylistSpringJpaAdapter(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }

    @Override
    public void addPlaylist(Playlist playlist) {
        PlaylistEntity playlistEntity = new PlaylistEntity();
        BeanUtils.copyProperties(playlist, playlistEntity,"midias");

        for (Midia midia : playlist.getMidias()) {
            MidiaEntity midiaEntity = new MidiaEntity();
            BeanUtils.copyProperties(midia, midiaEntity);
            playlistEntity.addMidia(midiaEntity);
        }

        playlistEntity = playlistRepository.save(playlistEntity);
        BeanUtils.copyProperties(playlistEntity,playlist);

    }

    @Override
    public void removePlaylist(Integer playlistId) {
        playlistRepository.deleteById(playlistId);
    }

    @Override
    public List<Playlist> getPlaylists() {
        List<Playlist> playlistList = new ArrayList<Playlist>();
        List<PlaylistEntity> playlistEntityList = playlistRepository.findAll();
        for(PlaylistEntity playlistEntity : playlistEntityList) {
            Playlist playlist = new Playlist();
            BeanUtils.copyProperties(playlistEntity, playlist);
            playlistList.add(playlist);
        }
        return playlistList;
    }

    @Override
    public Playlist getPlaylistById(Integer playlistId) {
        PlaylistEntity playlistEntity = playlistRepository.findById(playlistId).get();
        if (playlistEntity == null) {
            // throw new PlaylistNotFoundException
        }
        Playlist playlist = new Playlist();
        BeanUtils.copyProperties(playlistEntity,playlist);

        return playlist;
    }
}
