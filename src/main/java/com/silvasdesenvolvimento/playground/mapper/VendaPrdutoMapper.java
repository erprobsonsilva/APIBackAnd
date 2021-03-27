package com.silvasdesenvolvimento.playground.mapper;

import com.silvasdesenvolvimento.playground.repository.entity.Entid_api;
import com.silvasdesenvolvimento.playground.rest.dto.Entid_apiDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public interface VendaPrdutoMapper {

    VendaPrdutoMapper MAPPER = Mappers.getMapper( VendaPrdutoMapper.class );
//    VendaPrdutoDto vendaprdutoTovenda_prdutoDto(VendaPrduto entity);
//    VendaPrduto vendaprdutoDtovendaprduto(VendaPrdutoDto dto);

}
