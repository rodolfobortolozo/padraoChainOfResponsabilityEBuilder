package br.com.chainofresponsibility.desconto;

public class CalculadoraDescontoPrimeiraFaixa extends CalculadoraFaixaDesconto {
	
	

	public CalculadoraDescontoPrimeiraFaixa(CalculadoraFaixaDesconto proximo) {
		super(proximo);
	}

	@Override
	protected Double calcular(Double valorTotal) {

		if(valorTotal > 300d && valorTotal <= 800d) {
			return valorTotal * 0.06;
		}
		return -1d;
	}

}
