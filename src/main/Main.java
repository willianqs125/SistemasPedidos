package main;

import model.*;
import pagamento.*;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Ana Silva",
                "12345678900",
                "ana@email.com"
        );

        Produto p1 = new Produto("Notebook", 3000.00);
        Produto p2 = new Produto("Mouse", 150.00);

        ItemPedido item1 = new ItemPedido(p1, 1);
        ItemPedido item2 = new ItemPedido(p2, 2);

        Pagamento pagamento = new PagamentoPix(); // polimorfismo

        Pedido pedido = new Pedido(cliente, pagamento);
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Total do pedido: R$ " + pedido.calcularTotal());
        System.out.println("Total de pedidos criados: " + Pedido.getTotalPedidos());
    }
}
