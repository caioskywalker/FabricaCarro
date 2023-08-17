package fabrica.premium;

import abstractFactory.Carro;

public class MiniCouper extends Carro {

	public MiniCouper(int potencia, String tipoCombustivel, String cor, int numeroPortas) {
		super(potencia, tipoCombustivel, cor, numeroPortas);
		String mensagem = "Seu Carro é um Mini Couper!";
		System.out.println(mensagem);
		// TODO Auto-generated constructor stub
	}

}
