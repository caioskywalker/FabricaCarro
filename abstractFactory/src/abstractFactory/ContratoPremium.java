package abstractFactory;
import fabrica.premium.*;
public class ContratoPremium extends Fabrica {

	
	Carro encontrarCarro(String pedidoCarro) {
		
		switch(pedidoCarro.toUpperCase()) {// String => A=Creta, B=Compass, C=Couper
		
		case "A":
			return new HyundaiCreta(167,"gasolina/alcool","vermelha",4);
		case "B":
			return new JeepCompass(240,"Diesel","azul",4);
		case "C":
			return new MiniCouper(192,"eletricidade","cinza",3);
		default:
			System.out.println("Opção não disponível.");
			return null;
		
		}
	}

}
