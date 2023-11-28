package br.com.chainofresponsibility.pedido;

import br.com.chainofresponsibility.desconto.*;

import java.util.List;

public class Pedido {

	private CalculadoraFaixaDesconto calculadoraFaixaDesconto;
	
	private Cliente cliente;
	
	private Double totalItens;
	
	private Double totalDesconto;
	
	private Double totalLiquido;

	private List<ItemPedido> itemPedido;

	public Pedido() {
		this.calculadoraFaixaDesconto =
				new CalculadoraDescontoTerceiraFaixa(
					new CalculadoraDescontoSegundaFaixa(
						new CalculadoraDescontoPrimeiraFaixa(
							new SemDesconto(null))));
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getTotalItens() {
		
		return this.itemPedido.stream().mapToDouble(i->i.getVlrTotalItem()).sum();
	}

	public Double getTotalDesconto() {
		return calculadoraFaixaDesconto.desconto(this.getTotalItens());
	}

	public Double getTotalLiquido() {
		return this.getTotalItens() - this.getTotalDesconto();
	}

	public List<ItemPedido> getItemPedido() {
		return this.itemPedido;
	}

	public void setItemPedido(List<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}
}
