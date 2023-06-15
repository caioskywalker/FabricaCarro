package abstractFactory;

public class Cliente {
	
	private Boolean tipoContrato; // true para Contrato Premium, false para Contrato popular
	private String pedidoCarro; 
	// caso o tipo de contrato seja premium(true) String => A=Creta, B=Compass, C=Couper
	//caso contrato seja popular(false) String => A=Celta, B=Gol, C=Uno
	
	public Cliente(Boolean tipoContrato, String pedidoCarro) {
		this.pedidoCarro = pedidoCarro;
		this.tipoContrato = tipoContrato;
	}
	
	public Boolean tipoContrato() {
		return tipoContrato;
	}
	
	public String pedidoCarro() {
		return pedidoCarro;
		
	}
	

}
