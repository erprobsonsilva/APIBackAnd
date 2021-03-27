package com.silvasdesenvolvimento.playground.rest;

import com.silvasdesenvolvimento.playground.mapper.Entid_apiMapper;
import com.silvasdesenvolvimento.playground.rest.dto.Entid_apiDto;
import com.silvasdesenvolvimento.playground.service.Entid_apiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.tools.jconsole.JConsole;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import static com.silvasdesenvolvimento.playground.rest.Entid_apiRestController.API_BASE_URI;

@CrossOrigin("*")
@RestController
@RequestMapping(API_BASE_URI)
public class Entid_apiRestController {

    private static Logger logger = LoggerFactory.getLogger(Entid_apiRestController.class);

    public static final String API_BASE_URI = "/api/entids";

    // observacao: aqui declaramos a interface nae implementacao
    // implementacao podemos mudar a qualquer hora mas sempre existirao os mesmos methodos
    // assim nao precisamos mudar nada aqui;
    @Autowired
    private Entid_apiService entid_apiService;

    @GetMapping
    // aqui ja trabalhamos com http response com status
    public ResponseEntity<List<Entid_apiDto>> listarEntid_apis() {
        return ResponseEntity.ok(entid_apiService.listarEntid_apis());
    }

    @GetMapping("/{entid_apiId}")
    public ResponseEntity<Entid_apiDto> buscarEntid_api(@PathVariable("entid_apiId") long entid_apiId) {
        logger.info(entid_apiService.buscarPorId(entid_apiId).getEn_nom());
        return ResponseEntity.ok(entid_apiService.buscarPorId(entid_apiId));
    }

    @DeleteMapping("/{entid_apiId}")
    public ResponseEntity<Void> removerEntid_api(@PathVariable("entid_apiId") long entid_apiId) {
        entid_apiService.remover(entid_apiId);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Void> salvarEntid_api(@Valid @RequestBody Entid_apiDto dto) throws URISyntaxException {
        Entid_apiDto entid_apiDtoSalvo = entid_apiService.salvar(Entid_apiMapper.MAPPER.entid_apiDtoentid_api(dto));
        // retornamos a uri do entid_api salvo
        // podemos retorna o objeto salvo
        return ResponseEntity.created(new URI(API_BASE_URI + "/" + entid_apiDtoSalvo.getEn_cod())).build();
    }

    @PutMapping("/{entid_apiId}")
    public ResponseEntity<Void> atualizarEntid_api(@PathVariable("entid_apiId") long entid_apiId, @Valid @RequestBody Entid_apiDto dto) {
        entid_apiService.atualizar(entid_apiId, Entid_apiMapper.MAPPER.entid_apiDtoentid_api(dto));
        return ResponseEntity.ok().build() ;
    }
}
