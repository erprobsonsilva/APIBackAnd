package com.silvasdesenvolvimento.playground.mapper;

import com.silvasdesenvolvimento.playground.repository.entity.Entid_api;
import com.silvasdesenvolvimento.playground.rest.dto.Entid_apiDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public interface Entid_apiMapper {

    Entid_apiMapper MAPPER = Mappers.getMapper( Entid_apiMapper.class );
    Entid_apiDto entid_apiToEntid_apiDto(Entid_api entity);
    Entid_api entid_apiDtoentid_api(Entid_apiDto dto);

}
