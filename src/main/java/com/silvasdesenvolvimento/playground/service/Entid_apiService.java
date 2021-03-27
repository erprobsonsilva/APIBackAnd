package com.silvasdesenvolvimento.playground.service;

import com.silvasdesenvolvimento.playground.repository.entity.Entid_api;
import com.silvasdesenvolvimento.playground.rest.dto.Entid_apiDto;

import java.util.List;

/*
    Interface sempre usaremos antes de implementar o service
    Podemos mudar a implementacao a qualquer hora ate mesmo en runtime,
    Mais para frente ficara mais claro,
    Eh um contrato que qualquer servico que implementar esta interface tera que conter os methodos que estao aqui...
 */
public interface Entid_apiService {

// documentacao dos methodos para todos que vao usar saberem oque faz :)

    /**
     * retorna uma lista de entid_api
     * @return  lista de entid_api
     */
    public List<Entid_apiDto> listarEntid_apis();

    // Nome dos methodos podemos discutir, estou acustumado em ingles o rob vai saber melhor como nomear :)
    /**
     * Retorna um entid_apiDto
     * @param id o identificador do entid_api
     * @return {@link Entid_apiDto}
     */
    public Entid_apiDto buscarPorId(long id);

    /**
     *  Salva entid_api no banco de dados
     * @param entid_api entid_api para salvar
     * @return {@link Entid_apiDto}
     */
    public Entid_apiDto salvar(Entid_api entid_api);

    /**
     *  utualiza entid_api no banco
     * @param id o identificador do entid_api
     * @param entid_api entid_api atualizado
     */
    public void atualizar(long id, Entid_api entid_api) ;

    /**
     *  remove entid_api no banco
     * @param id o identificador do entid_api
     */
    public void remover(long id);
}
