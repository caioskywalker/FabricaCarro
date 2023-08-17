package abstractFactory;

public abstract class Carro {
	
	private int potencia;
	private String tipoCombustivel;
	private String cor;
	private int numeroPortas;
	
	public Carro(int potencia,String tipoCombustivel,String cor,int numeroPortas) {
		this.potencia = potencia;
		this.tipoCombustivel = tipoCombustivel;
		this.cor = cor;
		this.numeroPortas = numeroPortas;
		
	}
	
	public void startEngine() {
		System.out.println("O motor a " + tipoCombustivel + " tem potência de " + potencia + " cavalos." );
		
	}
	
	public void clean() {
		System.out.println("O carro está limpo e a cor " + cor.toLowerCase() + " está brilhando.");
	}
	
	public void quantidadePortas() {
		System.out.println("O seu carro possui " + numeroPortas + " portas.");
	}
	
	

}
