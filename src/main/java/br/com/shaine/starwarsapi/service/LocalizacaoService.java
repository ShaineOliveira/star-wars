package br.com.shaine.starwarsapi.service;

import br.com.shaine.starwarsapi.dto.LocalizacaoRequestDto;
import br.com.shaine.starwarsapi.model.Localizacao;
import br.com.shaine.starwarsapi.model.Rebelde;
import br.com.shaine.starwarsapi.repository.LocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalizacaoService {

    @Autowired
    private LocalizacaoRepository localizacaoRepository;
    public Localizacao buscar(Long id){
        return localizacaoRepository.findById(id).orElseThrow();
    }
    public Localizacao atualizar(Long id, LocalizacaoRequestDto localizacaoRequestDto){
        Localizacao localizacaoDB = buscar(id);
        Localizacao localizacao = localizacaoRequestDto.toLocalizacao(localizacaoDB);
        //localizacao.setId(id);
        localizacao.setLatitude(localizacaoRequestDto.latitude());
        localizacao.setLongitude(localizacaoRequestDto.longitude());
        localizacao.setNomeGalaxia(localizacaoRequestDto.nomeGalaxia());
        return localizacaoRepository.save(localizacao);

    }
}
