package br.com.shaine.starwarsapi.dto;

import br.com.shaine.starwarsapi.enums.Genero;
import br.com.shaine.starwarsapi.model.Localizacao;
import br.com.shaine.starwarsapi.model.Rebelde;
import lombok.Data;

@Data
public class RebeldeRequestDto {
    private String nome;
    private Integer idade;
    private Genero genero;
    private LocalizacaoRequestDto localizacao;

//    public Rebelde toRebelde() {
//        return new Rebelde(null, nome, idade, genero, localizacao.toLocalizacao(), null, 0, false);
//    }
}
