package br.unipar.programacaointernet.clinica.configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Clínica Unipar - Rest API")
                        .description("API para agendamento de consultas." +
                                " Trabalho de Programação para Internet," +
                                " Curso de Análise e Desenvolvimento de Sistemas," +
                                " Universidade Paranaense - UNIPAR." +
                                " Valor: 2.0")
                        .version("1.0")
                ).externalDocs(
                        new ExternalDocumentation()
                                .description("Unipar")
                                .url("http://www.unipar.br"));
    }
}
