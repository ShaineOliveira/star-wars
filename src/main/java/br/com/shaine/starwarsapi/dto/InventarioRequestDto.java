package br.com.shaine.starwarsapi.dto;

import br.com.shaine.starwarsapi.model.Item;

import java.util.List;

public record InventarioRequestDto(List<Item> itens) {

}
