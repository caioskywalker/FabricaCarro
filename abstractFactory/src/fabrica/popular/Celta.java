package fabrica.popular;

import abstractFactory.Carro;

public class Celta extends Carro {
	

	public Celta(int potencia, String tipoCombustivel, String cor, int numeroPortas) {
		super(potencia, tipoCombustivel, cor, numeroPortas);
		String mensagem = "Seu Carro é um Celta!";
		System.out.println(mensagem);
		
		// TODO Auto-generated constructor stub
	}
	
}
