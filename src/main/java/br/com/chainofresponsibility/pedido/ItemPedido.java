package br.com.chainofresponsibility.pedido;

public class ItemPedido {

	private Long id;

	private String Descricao;

	private Double valorUnitario;

	private Double quantidade;

	private Double VlrTotalItem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getVlrTotalItem() {
		return quantidade * valorUnitario;
	}

	
}
