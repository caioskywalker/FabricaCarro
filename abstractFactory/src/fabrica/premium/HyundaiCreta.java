package fabrica.premium;

import abstractFactory.Carro;

public class HyundaiCreta extends Carro{

	public HyundaiCreta(int potencia, String tipoCombustivel, String cor, int numeroPortas) {
		super(potencia, tipoCombustivel, cor, numeroPortas);
		String mensagem = "Seu Carro é um Hyundai Creta!";
		System.out.println(mensagem);
	}

}
