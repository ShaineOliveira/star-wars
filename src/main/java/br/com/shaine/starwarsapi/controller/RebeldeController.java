package br.com.shaine.starwarsapi.controller;

import br.com.shaine.starwarsapi.dto.LocalizacaoRequestDto;
import br.com.shaine.starwarsapi.dto.RebeldeRequestDto;
import br.com.shaine.starwarsapi.dto.RebeldeResponseDto;
import br.com.shaine.starwarsapi.mapper.RebeldeMapper;
import br.com.shaine.starwarsapi.model.Rebelde;
import br.com.shaine.starwarsapi.service.RebeldeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rebelde")
public class RebeldeController {

    @Autowired //Injeção de dependências
    private RebeldeService rebeldeService;

    @PostMapping("/cadastrar")
    public ResponseEntity<RebeldeResponseDto> salvar(@RequestBody RebeldeRequestDto rebeldeRequestDto){
        Rebelde salvar = rebeldeService.salvar(RebeldeMapper.INSTANCE.toRebelde(rebeldeRequestDto));
        RebeldeResponseDto rebeldeResponse = RebeldeResponseDto.toRebeldeResponse(salvar);
        return ResponseEntity.ok(rebeldeResponse);
    }

    @GetMapping
    public ResponseEntity<Rebelde> buscar(@RequestParam Long id) {
        Rebelde rebelde = rebeldeService.buscar(id);
        return ResponseEntity.ok(rebelde);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Rebelde>> listar(){
            List<Rebelde> rebeldeList = rebeldeService.buscarLista();
            return ResponseEntity.ok(rebeldeList);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        rebeldeService.deletar(id);
        //return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> reportar(@PathVariable Long id){
        rebeldeService.reportar(id);
        return ResponseEntity.ok().build();
    }


}
