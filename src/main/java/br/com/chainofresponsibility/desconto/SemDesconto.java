package br.com.chainofresponsibility.desconto;

public class SemDesconto extends CalculadoraFaixaDesconto {
	
	

	public SemDesconto(CalculadoraFaixaDesconto proximo) {
		super(proximo);
	}

	@Override
	protected Double calcular(Double valorTotal) {
		return 0d;
	}

}
