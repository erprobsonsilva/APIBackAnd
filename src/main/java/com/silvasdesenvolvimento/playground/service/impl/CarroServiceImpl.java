package com.silvasdesenvolvimento.playground.service.impl;

import com.silvasdesenvolvimento.playground.mapper.CarroMapper;
import com.silvasdesenvolvimento.playground.repository.CarroRepository;
import com.silvasdesenvolvimento.playground.repository.entity.Carro;
import com.silvasdesenvolvimento.playground.rest.dto.CarroDto;
import com.silvasdesenvolvimento.playground.service.CarroService;
import com.silvasdesenvolvimento.playground.service.exceptions.ObjetoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// anotacao do spring boot, assim ele entende que eh um bean e vai junto com configuracoes
@Service
// implementacao de CarroService, eh obrigatorio implementar os methodos la definidos
public class CarroServiceImpl implements CarroService {


    // Este cara vai se comunicar com o banco...
    @Autowired
    private CarroRepository carroRepository;

    @Override
    public List<CarroDto> listarCarros() {
        // aqui uso lambda para mappear todos os carros para carroDto
        // mesma coisa que um forEach ...
        return carroRepository.findAll()
                .stream()
                .map(CarroMapper.MAPPER::carroToCarroDto)
                .collect(Collectors.toList());
    }

    @Override
    public CarroDto buscarPorId(long id) {
        // aqui retornamos um erro se objeto nao for encontrado
        // seria o mesmo que fazer if(carro == null) {joga um erro}
        // outro exemplo mais abaixo no method atualizar
        Carro carro = carroRepository.findById(id)
                .orElseThrow(() -> new ObjetoNotFoundException("Carro com o id= " + id + " nao foi encontrado"));

        // retorna um carro mappeado par carroDto
        // examplos na classe de testes  CarroMapperTest
        return CarroMapper.MAPPER.carroToCarroDto(carro);
    }

    @Override
    public CarroDto salvar(Carro carro) {
        return CarroMapper.MAPPER.carroToCarroDto(carroRepository.save(carro));
    }

    @Override
    public void atualizar(long id, Carro novoCarro) {
        Optional<Carro> carroAntigo = carroRepository.findById(id);
        // verifica se carro existe, JpaRepository retorna optional do objeto que queremos
        // ai ja temos varios methodos nele proprio e embala o objeto
        if (!carroAntigo.isPresent()) {
            throw new ObjetoNotFoundException("Carro com o id= " + id + " nao foi encontrado");
        }

        novoCarro.setId(id);
        carroRepository.save(novoCarro);
    }

    @Override
    public void remover(long id) {
        Carro carro = carroRepository.findById(id)
                .orElseThrow(() -> new ObjetoNotFoundException("Carro com o id= " + id + " nao foi encontrado"));
        carroRepository.delete(carro);
    }
}
