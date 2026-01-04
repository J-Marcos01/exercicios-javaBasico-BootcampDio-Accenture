package lambda_interfaces.calculadora_impostos;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import lambda_interfaces.calculadora_impostos.model.Produto;
import lambda_interfaces.calculadora_impostos.service.CategoriaProduto;

public class SistemaVendas {
    public static void main(String[] args) {

        var formatoMoeda = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));

        var produtos = List.of(
                new Produto("Arroz Integral", new BigDecimal("25.00"), CategoriaProduto.ALIMENTACAO),
                new Produto("Whey Protein", new BigDecimal("150.00"), CategoriaProduto.SAUDE_BEM_ESTAR),
                new Produto("Camiseta Java", new BigDecimal("80.00"), CategoriaProduto.VESTUARIO),
                new Produto("Ingresso Show", new BigDecimal("200.00"), CategoriaProduto.CULTURA));

        System.out.println("=== Relatório de Tributos ===");

        produtos.forEach(produto -> {
            var imposto = produto.calcularImposto();
            var precoFinal = produto.preco().add(imposto);

            System.out.printf("Produto: %-15s | Categ: %-15s | Preço: %s | Imposto: %s | Total: %s%n",
                    produto.nome(),
                    produto.categoria(),
                    formatoMoeda.format(produto.preco()),
                    formatoMoeda.format(imposto),
                    formatoMoeda.format(precoFinal));
        });
    }
}
