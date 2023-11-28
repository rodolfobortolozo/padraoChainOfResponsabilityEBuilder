package br.com.chainofresponsibility;

import br.com.chainofresponsibility.pedido.Cliente;
import br.com.chainofresponsibility.pedido.ItemPedido;
import br.com.chainofresponsibility.pedido.Pedido;
import br.com.chainofresponsibility.pedido.PedidoVendaBuilder;

import java.util.List;

public class Main {
	
	
	public static void main(String[] args) {

		Pedido pedido = new PedidoVendaBuilder()
				.comCliente(1L,"Rodolfo")
				.comItem(1l,"Item 1",2d,300d)
				.comItem(2l,"Item 2",2d,300d)
				.comItem(3l,"Item 3",2d,300d)
				.construir()
				;

		System.out.println("Cliente: "+ pedido.getCliente().getNome());
		System.out.println("Total Itens: "+ pedido.getTotalItens());
		System.out.println("Desconto: "+ pedido.getTotalDesconto());
		System.out.println("Total Liquido: "+ pedido.getTotalLiquido());
	}
}
