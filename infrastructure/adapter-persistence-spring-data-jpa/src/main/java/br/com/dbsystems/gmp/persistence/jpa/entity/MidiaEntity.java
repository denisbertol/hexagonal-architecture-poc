package br.com.dbsystems.gmp.persistence.jpa.entity;

import br.com.dbsystems.gmp.domain.model.Playlist;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "Midia")
@Table(name = "MIDIA")
@Data
public class MidiaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_midia")
    private Integer id;

    @Column(name = "arquivo")
    private String arquivo;

    @Column(name = "duracao")
    private Integer duracao;

    @Column(name = "ordem")
    private Integer ordem;

}
