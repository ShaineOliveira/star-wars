package br.com.shaine.starwarsapi.dto;

import br.com.shaine.starwarsapi.model.Localizacao;

public record LocalizacaoRequestDto(Long latitude, Long longitude, String nomeGalaxia) {


    public Localizacao toLocalizacao(){
        return new Localizacao(null, latitude, longitude, nomeGalaxia);
    }

    public Localizacao toLocalizacao(Localizacao localizacao){
        return new Localizacao(localizacao.getId(), localizacao.getLatitude(), localizacao.getLongitude(), localizacao.getNomeGalaxia());

    }
}
