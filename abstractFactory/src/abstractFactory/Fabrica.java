package abstractFactory;

public abstract class Fabrica {
	
	public Carro criador(String pedidoCarro) {
		Carro carro = encontrarCarro(pedidoCarro);
		carro = prepararCarro(carro);
		return carro;
		}
	
	private Carro prepararCarro(Carro carro) {
		carro.clean();
		carro.startEngine();
		carro.quantidadePortas();
		return carro;
	}
	
	abstract Carro encontrarCarro(String pedidoCarro);

}
