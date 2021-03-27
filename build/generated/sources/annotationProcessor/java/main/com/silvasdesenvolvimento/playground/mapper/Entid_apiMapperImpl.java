package com.silvasdesenvolvimento.playground.mapper;

import com.silvasdesenvolvimento.playground.repository.entity.Entid_api;
import com.silvasdesenvolvimento.playground.rest.dto.Entid_apiDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-26T13:36:58-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (Oracle Corporation)"
)
@Component
public class Entid_apiMapperImpl implements Entid_apiMapper {

    @Override
    public Entid_apiDto entid_apiToEntid_apiDto(Entid_api entity) {
        if ( entity == null ) {
            return null;
        }

        Entid_apiDto entid_apiDto = new Entid_apiDto();

        if ( entity.getEn_cod() != null ) {
            entid_apiDto.setEn_cod( entity.getEn_cod() );
        }
        entid_apiDto.setEn_nom( entity.getEn_nom() );
        entid_apiDto.setEn_flg_tip_pessoa( entity.getEn_flg_tip_pessoa() );

        return entid_apiDto;
    }

    @Override
    public Entid_api entid_apiDtoentid_api(Entid_apiDto dto) {
        if ( dto == null ) {
            return null;
        }

        Entid_api entid_api = new Entid_api();

        entid_api.setEn_cod( dto.getEn_cod() );
        entid_api.setEn_nom( dto.getEn_nom() );
        entid_api.setEn_flg_tip_pessoa( dto.getEn_flg_tip_pessoa() );

        return entid_api;
    }
}
