package abstractFactory;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual tipo de seu contrato? Premium ou Popular?");
		String contratoString = scanner.nextLine();
		String opcaoCarro;
		//String contratoLower = contratoString.toLowerCase();
		//System.out.println(contratoLower);
		boolean contratoBooleano = contratoString.equalsIgnoreCase("premium");
		
		if(contratoBooleano == true) {
			System.out.println("Qual carro você deseja?\n 'A' para Creta, 'B' para Jeep Compass e 'C' para Mini Couper.");
			opcaoCarro = scanner.nextLine();
		}
		else {
			System.out.println("Qual carro você deseja?\n 'A' para Celta, 'B' para Gol e 'C' Uno.");
			opcaoCarro = scanner.nextLine();
		}
		
		Cliente cliente = new Cliente (contratoBooleano,opcaoCarro);
		Fabrica fabrica = getFabrica(cliente);
		Carro carro = fabrica.criador(cliente.pedidoCarro());
	
		
		
	}
	
	private static Fabrica getFabrica(Cliente cliente) {
		if(cliente.tipoContrato()) {
			return new ContratoPremium();
		}
		else {
			return new ContratoPopular();
		}
		
	}
	
	
}
