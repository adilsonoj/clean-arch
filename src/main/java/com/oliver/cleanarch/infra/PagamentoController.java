package com.oliver.cleanarch.infra;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oliver.cleanarch.domain.Pagamento;
import com.oliver.cleanarch.infra.service.PagamentoService;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping
    public void criarPagmento(@RequestParam String tipo, @RequestBody Pagamento pagamento) {
        pagamentoService.criarPagamento(tipo, pagamento);
    }

}
