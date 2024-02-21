package br.com.shaine.starwarsapi.service;

import br.com.shaine.starwarsapi.dto.LocalizacaoRequestDto;
import br.com.shaine.starwarsapi.dto.RebeldeRequestDto;
import br.com.shaine.starwarsapi.model.Rebelde;
import br.com.shaine.starwarsapi.repository.RebeldeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RebeldeService {

    private RebeldeRepository rebeldeRepository;

    //Injeção de dependências via construtor
    public RebeldeService(RebeldeRepository rebeldeRepository){
        this.rebeldeRepository = rebeldeRepository;
    }

    public Rebelde salvar(Rebelde rebeldeRequestDto){

        return rebeldeRepository.save(rebeldeRequestDto);
    }

    public Rebelde buscar(Long id){
    return rebeldeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("id não encontrado"));
    }

    public List<Rebelde> buscarLista(){
        return rebeldeRepository.findAll();
    }

    public void deletar(Long id){
        Rebelde rebelde = buscar(id);
        rebeldeRepository.delete(rebelde);
    }

    public void reportar(Long id){
        Rebelde rebelde = buscar(id);
        Integer quantidadeDeReports = rebelde.getQuantidadeDeReports();
        rebelde.setQuantidadeDeReports(quantidadeDeReports + 1);
        if (rebelde.getQuantidadeDeReports() >= 3) {
            rebelde.setTraidor(true);
        }
        rebeldeRepository.save(rebelde);
    }


}
