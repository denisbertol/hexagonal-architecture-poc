package br.com.dbsystems.gmp.persistence.jpa.entity;

import br.com.dbsystems.gmp.domain.model.Midia;
import lombok.Data;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Playlist")
@Table(name = "PLAYLIST")
@Data
@Setter
public class PlaylistEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_playlist")
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "ativo")
    private Integer ativo;

    @Column(name = "ordem")
    private Integer ordem;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "id_playlist")
    private List<MidiaEntity> midias = new ArrayList<MidiaEntity>();

    public void addMidia(MidiaEntity midiaEntity) {
        midias.add(midiaEntity);
    }

    public void removeMidia(MidiaEntity midiaEntity) {
        midias.remove(midiaEntity);
    }

}