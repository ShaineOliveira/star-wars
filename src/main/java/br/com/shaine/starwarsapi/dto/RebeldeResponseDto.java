package br.com.shaine.starwarsapi.dto;

import br.com.shaine.starwarsapi.enums.Genero;
import br.com.shaine.starwarsapi.model.Localizacao;
import br.com.shaine.starwarsapi.model.Rebelde;

public record RebeldeResponseDto(String nome, Integer idade, Genero genero, Localizacao localizacao) {

    public static RebeldeResponseDto toRebeldeResponse(Rebelde rebelde){
        return new RebeldeResponseDto(rebelde.getNome(), rebelde.getIdade(), rebelde.getGenero(), rebelde.getLocalizacao());

    }
}
