package pagamento;

public class PagamentoCartao implements Pagamento {

    @Override
    public double calcularValorFinal(double valorBase) {
        return valorBase * 1.05;
    }
}
