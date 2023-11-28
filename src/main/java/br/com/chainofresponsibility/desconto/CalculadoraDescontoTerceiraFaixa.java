package br.com.chainofresponsibility.desconto;

public class CalculadoraDescontoTerceiraFaixa extends CalculadoraFaixaDesconto {
	
	

	public CalculadoraDescontoTerceiraFaixa(CalculadoraFaixaDesconto proximo) {
		super(proximo);
	}

	@Override
	protected Double calcular(Double valorTotal) {
		if(valorTotal > 1000d ) {
			return valorTotal * 0.08;
		}
		return -1d;
	}

}
