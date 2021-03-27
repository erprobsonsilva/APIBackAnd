package com.silvasdesenvolvimento.playground.service;

import com.silvasdesenvolvimento.playground.repository.entity.Carro;
import com.silvasdesenvolvimento.playground.rest.dto.CarroDto;
import com.silvasdesenvolvimento.playground.service.exceptions.ObjetoNotFoundException;

import java.util.List;

/*
    Interface sempre usaremos antes de implementar o service
    Podemos mudar a implementacao a qualquer hora ate mesmo en runtime,
    Mais para frente ficara mais claro,
    Eh um contrato que qualquer servico que implementar esta interface tera que conter os methodos que estao aqui...
 */
public interface CarroService {

// documentacao dos methodos para todos que vao usar saberem oque faz :)

    /**
     * retorna uma lista de carros
     * @return  lista de carros
     */
    public List<CarroDto> listarCarros();

    // Nome dos methodos podemos discutir, estou acustumado em ingles o rob vai saber melhor como nomear :)
    /**
     * Retorna um carroDto
     * @param id o identificador do carro
     * @return {@link CarroDto}
     */
    public CarroDto buscarPorId(long id);

    /**
     *  Salva carro no banco de dados
     * @param carro carro para salvar
     * @return {@link CarroDto}
     */
    public CarroDto salvar(Carro carro);

    /**
     *  utualiza carro no banco
     * @param id o identificador do carro
     * @param carro carro atualizado
     */
    public void atualizar(long id, Carro carro) ;

    /**
     *  remove carro no banco
     * @param id o identificador do carro
     */
    public void remover(long id);
}
