package br.com.shaine.starwarsapi.dto;

import br.com.shaine.starwarsapi.model.Localizacao;

public record LocalizacaoResponseDto(
        Long id,
        Long latitude,
        Long longitude,
        String nomeGalaxia) {

    public static LocalizacaoResponseDto toLocalizacaoResponseDto(Localizacao localizacao){
        return new LocalizacaoResponseDto(localizacao.getId(), localizacao.getLatitude(), localizacao.getLongitude(), localizacao.getNomeGalaxia());

    }
}
