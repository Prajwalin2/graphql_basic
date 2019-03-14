package com.tricon.graphql.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import  static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@Configuration
public class Swagger {
	@Bean
    public Docket bookApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tricon.graphql"))
                .paths(regex(".*"))
                .build();
}
}
