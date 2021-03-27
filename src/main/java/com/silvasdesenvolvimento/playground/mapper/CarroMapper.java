package com.silvasdesenvolvimento.playground.mapper;

import com.silvasdesenvolvimento.playground.repository.entity.Carro;
import com.silvasdesenvolvimento.playground.rest.dto.CarroDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public interface CarroMapper {

    CarroMapper MAPPER = Mappers.getMapper( CarroMapper.class );

    @Mappings({
            @Mapping(target="marca", source="entity.marca.nome"),
    })
    CarroDto carroToCarroDto(Carro entity);

    @Mappings({
            @Mapping(target="marca.nome", source="dto.marca"),
    })
    Carro carroDtocarro(CarroDto dto);

}
