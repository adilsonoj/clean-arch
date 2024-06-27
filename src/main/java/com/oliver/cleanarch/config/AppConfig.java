package com.oliver.cleanarch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.oliver.cleanarch.application.PagamentoUseCase;
import com.oliver.cleanarch.infra.persistence.inmemory.PagamentoInMemoryGateway;
import com.oliver.cleanarch.infra.persistence.jpa.PagamentoRepositorJpaGateway;

@Configuration
public class AppConfig {

    @Bean("jpa")
    @Primary
    public PagamentoUseCase pagamentoUseCaseJpa(PagamentoRepositorJpaGateway pagamentoRepositorJpaGateway) {
        return new PagamentoUseCase(pagamentoRepositorJpaGateway);
    }

    @Bean("memory")
    public PagamentoUseCase pagamentoUseCaseMemory(PagamentoInMemoryGateway pagamentoInMemoryGateway) {
        return new PagamentoUseCase(pagamentoInMemoryGateway);
    }
}
