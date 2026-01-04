package lambda_interfaces.calculadora_impostos.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import lambda_interfaces.calculadora_impostos.service.CategoriaProduto;
import lambda_interfaces.calculadora_impostos.service.Taxavel;

public record Produto(String nome, BigDecimal preco, CategoriaProduto categoria) implements Taxavel {

    
    public Produto {
        if (preco.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
    }

    @Override
    public BigDecimal calcularImposto() {
        return preco.multiply(categoria.getTaxaImposto())
                    .setScale(2, RoundingMode.HALF_UP);
    }
}