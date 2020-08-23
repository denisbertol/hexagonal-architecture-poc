package br.com.dbsystems.gmp.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Playlist {

    private Integer id;
    private String descricao;
    private Integer ativo;
    private Integer ordem;
    private List<Midia> midias = new ArrayList<Midia>();

}