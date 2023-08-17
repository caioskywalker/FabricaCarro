package abstractFactory;

import fabrica.popular.*;

public class ContratoPopular extends Fabrica{

	@Override
	Carro encontrarCarro(String pedidoCarro) { //String => A=Celta, B=Gol, C=Uno
		switch(pedidoCarro.toUpperCase()) {
		
		case "A":
			return new Celta(78,"gasolina","vermelha",2);
		case "B":
			return new Gol(84,"gasolina","branca",2);
		case "C":
			return new Uno(65,"alcool","cinza",2);
		default:
			System.out.println("Opção não disponível.");
			return null;
		
		}
		
			
	}

}
