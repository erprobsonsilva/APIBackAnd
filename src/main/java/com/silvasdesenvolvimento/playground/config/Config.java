package com.silvasdesenvolvimento.playground.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*
    Classe quando annotada com '@Configuration' tudo dentro dela eh iniciado antes de outras classes
    onde instanciamos os 'Beans' e outras configuracoes que presisamos no projeto
    Podemos ter varias classes de configuracos, devemos separas as configuracoes para nao ficar muito fora do controle
    com umas classe gigante con varias configuracos que nao sao para o mesmo proposito :)
*/
@Configuration
public class Config {

    /* examplo:
    @Bean
    public RestTemplate restTemplate(){
    Aqui podemos configurar o Bean como queremos
        return new RestTemplate();
    }

    agora em outra classe podemos instanciar esse 'Bean' usando @Autowired
    exemplo:
    @Autowired
    private RestTemplate restTemplate;
     */
}
