package com.oliver.cleanarch.infra.persistence.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.oliver.cleanarch.domain.Pagamento;
import com.oliver.cleanarch.gateway.PagamentoRepositoryGateway;

@Component
public class PagamentoInMemoryGateway implements PagamentoRepositoryGateway {

    @Override
    public void criarPagamento(Pagamento pagamento) {
        List<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(pagamento);

        pagamentos.stream().forEach(System.out::println);
    }

}
