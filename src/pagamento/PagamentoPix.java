package pagamento;

public class PagamentoPix implements Pagamento {

    @Override
    public double calcularValorFinal(double valorBase) {
        return valorBase * 0.95;
    }
}
