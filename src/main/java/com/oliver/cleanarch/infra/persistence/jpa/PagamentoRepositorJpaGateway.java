package com.oliver.cleanarch.infra.persistence.jpa;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.oliver.cleanarch.domain.Pagamento;
import com.oliver.cleanarch.gateway.PagamentoRepositoryGateway;

@Component
public class PagamentoRepositorJpaGateway implements PagamentoRepositoryGateway {

    private final PagamentoRepository pagamentoRepository;

    public PagamentoRepositorJpaGateway(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    @Override
    public void criarPagamento(Pagamento pagamento) {
        PagamentoEntity entity = new PagamentoEntity();
        BeanUtils.copyProperties(pagamento, entity);

        pagamentoRepository.save(entity);
    }

}
