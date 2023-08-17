package fabrica.premium;

import abstractFactory.Carro;

public class JeepCompass extends Carro{

	public JeepCompass(int potencia, String tipoCombustivel, String cor, int numeroPortas) {
		super(potencia, tipoCombustivel, cor, numeroPortas);
		String mensagem = "Seu Carro é um Jeep Compass!";
		System.out.println(mensagem);
		// TODO Auto-generated constructor stub
	}

}
