package fabrica.popular;

import abstractFactory.Carro;

public class Gol extends Carro {

	public Gol(int potencia, String tipoCombustivel, String cor, int numeroPortas) {
		super(potencia, tipoCombustivel, cor, numeroPortas);
		String mensagem = "Seu Carro é um Gol!";
		System.out.println(mensagem);
		// TODO Auto-generated constructor stub
	}

}
