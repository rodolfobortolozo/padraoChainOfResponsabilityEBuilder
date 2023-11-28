package br.com.chainofresponsibility.desconto;

public class CalculadoraDescontoSegundaFaixa extends CalculadoraFaixaDesconto {
	
	

	public CalculadoraDescontoSegundaFaixa(CalculadoraFaixaDesconto proximo) {
		super(proximo);
	}

	@Override
	protected Double calcular(Double valorTotal) {
		if(valorTotal > 800d && valorTotal <= 1000d) {
			return valorTotal * 0.08;
		}
		return -1d;
	}

}
