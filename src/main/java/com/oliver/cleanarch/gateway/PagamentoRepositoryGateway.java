package com.oliver.cleanarch.gateway;

import com.oliver.cleanarch.domain.Pagamento;

public interface PagamentoRepositoryGateway {
    void criarPagamento(Pagamento pagamento);
}
