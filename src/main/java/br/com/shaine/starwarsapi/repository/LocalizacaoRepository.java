package br.com.shaine.starwarsapi.repository;

import br.com.shaine.starwarsapi.model.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long> {
}
