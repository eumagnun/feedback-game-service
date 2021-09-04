package br.com.fiap.avaliacaoGame.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoGame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id=0;
    private String nome="";
    private String console="";
    private String nota="";
    private String urlImagem="";
    private String urlVideo="";
}
