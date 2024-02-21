package br.com.shaine.starwarsapi.mapper;

import br.com.shaine.starwarsapi.dto.RebeldeRequestDto;
import br.com.shaine.starwarsapi.model.Rebelde;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RebeldeMapper {

    RebeldeMapper INSTANCE = Mappers.getMapper(RebeldeMapper.class);

    Rebelde toRebelde(RebeldeRequestDto rebeldeRequestDto);
}
