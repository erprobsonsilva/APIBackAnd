package com.silvasdesenvolvimento.playground.mapper;

import com.silvasdesenvolvimento.playground.repository.entity.Carro;
import com.silvasdesenvolvimento.playground.repository.entity.Marca;
import com.silvasdesenvolvimento.playground.repository.entity.enums.CorCarro;
import com.silvasdesenvolvimento.playground.rest.dto.CarroDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarroMapperTest {

    private static final long CARRO_ID = 1L;
    private static final String CARRO_NOME = "Focus";
    private static final CorCarro CARRO_COR = CorCarro.BRANCO;
    private static final String MARCA_NOME = "Ford";

    @Test
    public void carroDtoToCarro() {
        CarroDto dto = new CarroDto(CARRO_ID, CARRO_NOME, CARRO_COR.name(), MARCA_NOME);

        Carro carro = mapDtoToCarro(dto);

        assertCarroEDtoSoIguais(carro, dto);
    }

    @Test
    public void carroToCarroDto() {
        Marca marca = new Marca();
        marca.setNome(MARCA_NOME);
        Carro carro = criarCarro(CARRO_ID, CARRO_NOME, marca, CARRO_COR);

        CarroDto dto = mapCarroIntoDto(carro);

        assertCarroEDtoSoIguais(carro, dto);
    }

    private Carro criarCarro(long id, String name, Marca marca, CorCarro cor) {
        Carro carro = new Carro();
        carro.setId(id);
        carro.setNome(name);
        carro.setMarca(marca);
        carro.setCor(cor);

        return carro;
    }

    private CarroDto mapCarroIntoDto(Carro carro) {
        return CarroMapper.MAPPER.carroToCarroDto(carro);
    }

    private Carro mapDtoToCarro(CarroDto dto) {
        return CarroMapper.MAPPER.carroDtocarro(dto);
    }

    private void assertCarroEDtoSoIguais(Carro carro, CarroDto dto) {
        assertEquals(carro.getId(), dto.getId());
        assertEquals(carro.getNome(), dto.getNome());
        assertEquals(carro.getCor().name(), dto.getCor());
        assertEquals(carro.getMarca().getNome(), dto.getMarca());
    }

}
