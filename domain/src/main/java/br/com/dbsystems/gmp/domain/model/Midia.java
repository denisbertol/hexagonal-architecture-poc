package br.com.dbsystems.gmp.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Midia {

    private Integer id;
    private String arquivo;
    private Integer duracao;
    private Integer ordem;

}
