package br.com.shaine.starwarsapi.model;

import br.com.shaine.starwarsapi.enums.Genero;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data   //Cria todos os get's e set's
@AllArgsConstructor  //Cria 1 construtor com todos os atributos
@NoArgsConstructor //Ele cria 1 construtor vazio
@Entity   //Indica que a classe é uma entidade no banco de dados
@Builder
public class Rebelde {

    @Id //Transforma o atributo debaixo em primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Incrementar o id
    private Long id;
    private String nome;
    private Integer idade;
    @Enumerated(EnumType.STRING) //Salva o valor da string
    private Genero genero;
    @ManyToOne(cascade = CascadeType.ALL)  //Mais de um rebelde tem uma localização
    private Localizacao localizacao;
    @OneToOne(cascade = CascadeType.ALL) //Um rebelde tem um inventário
    private Inventario inventario;
    private Integer quantidadeDeReports;
    private boolean traidor;





}
