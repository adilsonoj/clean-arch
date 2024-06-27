package com.oliver.cleanarch.infra.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.oliver.cleanarch.application.PagamentoUseCase;
import com.oliver.cleanarch.domain.Pagamento;

@Service
public class PagamentoService {
    private final Map<String, PagamentoUseCase> pagamentoUseCaseMap;

    public PagamentoService(Map<String, PagamentoUseCase> pagamentoUseCaseMap) {
        this.pagamentoUseCaseMap = pagamentoUseCaseMap;
    }

    public void criarPagamento(String tipo, Pagamento pagamento) {
        pagamentoUseCaseMap.get(tipo).criarPagamento(pagamento);
    }
}
