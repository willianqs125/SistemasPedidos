package model;

import pagamento.Pagamento;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private static int totalPedidos = 0;

    private Cliente cliente;
    private List<ItemPedido> itens;
    private Pagamento pagamento;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        totalPedidos++;
    }

    public Pedido(Cliente cliente, Pagamento pagamento) {
        this(cliente);
        this.pagamento = pagamento;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return pagamento.calcularValorFinal(total);
    }

    public static int getTotalPedidos() {
        return totalPedidos;
    }
}
