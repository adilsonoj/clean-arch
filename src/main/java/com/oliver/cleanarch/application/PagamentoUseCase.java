package com.oliver.cleanarch.application;

import com.oliver.cleanarch.domain.Pagamento;
import com.oliver.cleanarch.gateway.PagamentoRepositoryGateway;

public class PagamentoUseCase {
    private final PagamentoRepositoryGateway pagamentoGateway;

    public PagamentoUseCase(PagamentoRepositoryGateway pagamentoGateway) {
        this.pagamentoGateway = pagamentoGateway;
    }

    public void criarPagamento(Pagamento pagamento) {
        pagamentoGateway.criarPagamento(pagamento);
    }
}
