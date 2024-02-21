package br.com.shaine.starwarsapi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL) //Muitos invetários podem ter muitos itens
    @JoinTable(
            name = "itens_inventario",
            joinColumns = @JoinColumn(name = "inventario_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<Item> itens;


}
