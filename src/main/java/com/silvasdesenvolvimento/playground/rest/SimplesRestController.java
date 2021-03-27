package com.silvasdesenvolvimento.playground.rest;

import com.silvasdesenvolvimento.playground.rest.dto.SimplesObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

// anotacao do spring boot para se auto-configurar para comunicacao com front-end
// classe rest-controler de example sem uso banco de dados
@RestController
/*
  Spring boot configuracao para mappear endpoint
 por examplo aqui temos mappeado /api/simples-rest
 na maquina local deve iniciar localhost:8080/api/simples-rest
 8080 eh a porta default do spring boot inicia applicacoes, pode ser mudada em 'application.yaml' :)
*/
@RequestMapping("/api/simples-rest")
public class SimplesRestController {

    /*
    Simples endpoind retornando uma string
    @GetMapping annotacao do spring boot,
    Para chamar eh simples no navegador example localhost:8080/api/simples-rest
     */
    @GetMapping
    public String msgDeBemvindo(){
        return "<h1>Bem Vindo ao Playground!</h1></br>" +
                "<h3>Parabens sou applicacao esta rodando :)</h3></br>" +
                "Sinta-se livre para brincar com essa applicacao, fazendo mudancas e testando seu ambiente de trablalho!";
    }

    /*
     Simples endpoind retornando um objeto com um nome de entrada
     @GetMapping annotacao do spring boot,
     Para chamar eh simples no navegador example localhost:8080/api/simples-rest/algum-nome
  */
    @GetMapping("/{nomeObjeto}")
    // nomeObjeto eh igual em @GetMapping e em @PathVariable assim mapeamos para variavei 'nome' o string de entrada...
    public Object buscarSimplesObjectByNome(@PathVariable("nomeObjeto") String nome) {
        return new SimplesObject(nome,"Eu esta aprendendo java...");
    }

    @DeleteMapping("/{nomeObjeto}")
    // mesma coisa deletando um objeto pelo nome
    public String deleteSimplesObjeto(@PathVariable("nomeObjeto") String nome){
        return  "Objeto deletato com successo";
    }

    // Aqui recebemos um objeto do front-end
    @PostMapping()
    // retornariamos uma uri onde buscar o objeto examplo localhost:8080/api/simples-rest/nomedoObectoSalvo
    // ai poderiamos logo buscar o objeto criado...
    // aqui estou retornando so uma string
    public String salvarSimplesObjct(@Valid @RequestBody SimplesObject simplesObject) {
        return "Objeto salvo com successo";
    }

    @PutMapping("/{nomeObjeto}")
    // retornariamos um http codigo 200
    // aki como no method 'buscarSimplesObjectByNome' temos um @PathVariable para saber qual objeto queremos atualizar
    // e temos o novo @RequetBody que eh o novo SimplesObjeto
    // aqui estou retornando so uma string
    public String atualizarObjeto(@PathVariable("nomeObjeto") String nome,@Valid @RequestBody SimplesObject simplesObject){
        return "Objeto atualizado com successo";
    }

}
