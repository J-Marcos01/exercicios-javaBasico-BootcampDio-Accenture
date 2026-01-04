package lambda_interfaces.calculadora_impostos.service;

import java.math.BigDecimal;

public enum CategoriaProduto {

    ALIMENTACAO(new BigDecimal("0.01")),
    SAUDE_BEM_ESTAR(new BigDecimal("0.015")),
    VESTUARIO(new BigDecimal("0.025")),
    CULTURA(new BigDecimal("0.04"));

    private final BigDecimal taxaImposto;

    CategoriaProduto(BigDecimal taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    public BigDecimal getTaxaImposto() {
        return taxaImposto;
    }
}

