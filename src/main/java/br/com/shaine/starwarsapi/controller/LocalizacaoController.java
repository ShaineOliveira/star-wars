package br.com.shaine.starwarsapi.controller;

import br.com.shaine.starwarsapi.dto.LocalizacaoRequestDto;
import br.com.shaine.starwarsapi.dto.LocalizacaoResponseDto;
import br.com.shaine.starwarsapi.model.Localizacao;
import br.com.shaine.starwarsapi.service.LocalizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/localizacao")

public class LocalizacaoController {

    @Autowired
    private LocalizacaoService localizacaoService;

    @PutMapping("/{id}")
    public ResponseEntity<LocalizacaoResponseDto> atualizar(@PathVariable Long id, @RequestBody LocalizacaoRequestDto localizacaoRequestDto){
        Localizacao localizacao = localizacaoService.atualizar(id, localizacaoRequestDto);
        LocalizacaoResponseDto localizacaoResponseDto = LocalizacaoResponseDto.toLocalizacaoResponseDto(localizacao);
        return ResponseEntity.ok(localizacaoResponseDto);

    }

}
