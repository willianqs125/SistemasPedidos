package pagamento;

public class PagamentoBoleto implements Pagamento {

    @Override
    public double calcularValorFinal(double valorBase) {
        return valorBase;
    }
}
