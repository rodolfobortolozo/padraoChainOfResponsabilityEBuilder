package br.com.chainofresponsibility.desconto;

public abstract class CalculadoraFaixaDesconto {
	
	private CalculadoraFaixaDesconto proximo;

	  public CalculadoraFaixaDesconto( CalculadoraFaixaDesconto proximo) {
		  this.proximo = proximo;
	  }
	  
	  public Double desconto(Double valorTotal) {
		  Double desconto = calcular(valorTotal);

		  if(desconto  == -1d ) {
			  return proximo.desconto(valorTotal);
		  }
		  
		  return desconto;
	  }
	  
	  protected abstract Double calcular(Double valorTotal);

}
