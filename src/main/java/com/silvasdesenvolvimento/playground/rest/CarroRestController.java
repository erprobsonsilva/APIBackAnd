package com.silvasdesenvolvimento.playground.rest;

import com.silvasdesenvolvimento.playground.mapper.CarroMapper;
import com.silvasdesenvolvimento.playground.rest.dto.CarroDto;
import com.silvasdesenvolvimento.playground.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import static com.silvasdesenvolvimento.playground.rest.CarroRestController.API_BASE_URI;

@RestController
@RequestMapping(API_BASE_URI)
public class CarroRestController {

    public static final String API_BASE_URI = "/api/carros";

    // observacao: aqui declaramos a interface nae implementacao
    // implementacao podemos mudar a qualquer hora mas sempre existirao os mesmos methodos
    // assim nao precisamos mudar nada aqui;
    @Autowired
    private CarroService carroService;

    @GetMapping
    // aqui ja trabalhamos com http response com status
    public ResponseEntity<List<CarroDto>> listarCarros() {
        return ResponseEntity.ok(carroService.listarCarros());
    }

    @GetMapping("/{carroId}")
    public ResponseEntity<CarroDto> buscarCarro(@PathVariable("carroId") long carroId) {
        return ResponseEntity.ok(carroService.buscarPorId(carroId));
    }

    @DeleteMapping("/{carroId}")
    public ResponseEntity<Void> removerCarro(@PathVariable("carroId") long carroId) {
        carroService.remover(carroId);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Void> salvarCarro(@Valid @RequestBody CarroDto dto) throws URISyntaxException {
        CarroDto carroDtoSalvo = carroService.salvar(CarroMapper.MAPPER.carroDtocarro(dto));
        // retornamos a uri do carro salvo
        // podemos retorna o objeto salvo
        return ResponseEntity.created(new URI(API_BASE_URI + "/" + carroDtoSalvo.getId())).build();
    }

    @PutMapping("/{carroId}")
    public ResponseEntity<Void> atualizarCarro(@PathVariable("carroId") long carroId, @Valid @RequestBody CarroDto dto) {
        carroService.atualizar(carroId, CarroMapper.MAPPER.carroDtocarro(dto));
        return ResponseEntity.ok().build() ;
    }
}
