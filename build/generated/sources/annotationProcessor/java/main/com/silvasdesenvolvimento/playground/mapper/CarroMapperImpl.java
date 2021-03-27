package com.silvasdesenvolvimento.playground.mapper;

import com.silvasdesenvolvimento.playground.repository.entity.Carro;
import com.silvasdesenvolvimento.playground.repository.entity.Marca;
import com.silvasdesenvolvimento.playground.repository.entity.enums.CorCarro;
import com.silvasdesenvolvimento.playground.rest.dto.CarroDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-26T13:36:58-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (Oracle Corporation)"
)
@Component
public class CarroMapperImpl implements CarroMapper {

    @Override
    public CarroDto carroToCarroDto(Carro entity) {
        if ( entity == null ) {
            return null;
        }

        CarroDto carroDto = new CarroDto();

        carroDto.setMarca( entityMarcaNome( entity ) );
        if ( entity.getId() != null ) {
            carroDto.setId( entity.getId() );
        }
        carroDto.setNome( entity.getNome() );
        if ( entity.getCor() != null ) {
            carroDto.setCor( entity.getCor().name() );
        }

        return carroDto;
    }

    @Override
    public Carro carroDtocarro(CarroDto dto) {
        if ( dto == null ) {
            return null;
        }

        Carro carro = new Carro();

        carro.setMarca( carroDtoToMarca( dto ) );
        carro.setId( dto.getId() );
        carro.setNome( dto.getNome() );
        if ( dto.getCor() != null ) {
            carro.setCor( Enum.valueOf( CorCarro.class, dto.getCor() ) );
        }

        return carro;
    }

    private String entityMarcaNome(Carro carro) {
        if ( carro == null ) {
            return null;
        }
        Marca marca = carro.getMarca();
        if ( marca == null ) {
            return null;
        }
        String nome = marca.getNome();
        if ( nome == null ) {
            return null;
        }
        return nome;
    }

    protected Marca carroDtoToMarca(CarroDto carroDto) {
        if ( carroDto == null ) {
            return null;
        }

        Marca marca = new Marca();

        marca.setNome( carroDto.getMarca() );

        return marca;
    }
}
