package fabrica.popular;

import abstractFactory.Carro;

public class Uno extends Carro{

	public Uno(int potencia, String tipoCombustivel, String cor, int numeroPortas) {
		super(potencia, tipoCombustivel, cor, numeroPortas);
		String mensagem = "Seu Carro é um Uno!";
		System.out.println(mensagem);
	}

}
