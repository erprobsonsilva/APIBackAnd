package com.silvasdesenvolvimento.playground.service.impl;

import com.silvasdesenvolvimento.playground.mapper.Entid_apiMapper;
import com.silvasdesenvolvimento.playground.repository.Entid_apiRepository;
import com.silvasdesenvolvimento.playground.repository.entity.Entid_api;
import com.silvasdesenvolvimento.playground.rest.dto.Entid_apiDto;
import com.silvasdesenvolvimento.playground.service.Entid_apiService;
import com.silvasdesenvolvimento.playground.service.exceptions.ObjetoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// anotacao do spring boot, assim ele entende que eh um bean e vai junto com configuracoes
@Service
// implementacao de Entid_apiService, eh obrigatorio implementar os methodos la definidos
public class Entid_apiImpl implements Entid_apiService {


    // Este cara vai se comunicar com o banco...
    @Autowired
    private Entid_apiRepository entid_apiRepository;

    @Override
    public List<Entid_apiDto> listarEntid_apis() {
        // aqui uso lambda para mappear todos os Entid_api para Entid_apiDto
        // mesma coisa que um forEach ...
        return entid_apiRepository.findAll()
                .stream()
                .map(Entid_apiMapper.MAPPER::entid_apiToEntid_apiDto)
                .collect(Collectors.toList());
    }

    @Override
    public Entid_apiDto buscarPorId(long id) {
        // aqui retornamos um erro se objeto nao for encontrado
        // seria o mesmo que fazer if(entid_api == null) {joga um erro}
        // outro exemplo mais abaixo no method atualizar
        Entid_api entid_api = entid_apiRepository.findById(id)
                .orElseThrow(() -> new ObjetoNotFoundException("Entidade com o id= " + id + " nao foi encontrado"));

        // retorna um entid_api mappeado par entid_apiDto
        // examplos na classe de testes  Entid_apiMapperTest
        return Entid_apiMapper.MAPPER.entid_apiToEntid_apiDto(entid_api);
    }

    @Override
    public Entid_apiDto salvar(Entid_api entid_api) {
        return Entid_apiMapper.MAPPER.entid_apiToEntid_apiDto(entid_apiRepository.save(entid_api));
    }

    @Override
    public void atualizar(long id, Entid_api novoEntid_api) {
        Optional<Entid_api> entid_apiAntigo = entid_apiRepository.findById(id);
        // verifica se entid_api existe, JpaRepository retorna optional do objeto que queremos
        // ai ja temos varios methodos nele proprio e embala o objeto
        if (!entid_apiAntigo.isPresent()) {
            throw new ObjetoNotFoundException("Entidade com o id= " + id + " nao foi encontrado");
        }

        novoEntid_api.setEn_cod(id);
        entid_apiRepository.save(novoEntid_api);
    }

    @Override
    public void remover(long id) {
        Entid_api entid_api = entid_apiRepository.findById(id)
                .orElseThrow(() -> new ObjetoNotFoundException("Entididade com o id= " + id + " nao foi encontrado"));
        entid_apiRepository.delete(entid_api);
    }
}
