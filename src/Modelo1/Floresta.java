package Modelo1;



public class Floresta extends Local{
	
	private String folha;
	private String tronco;

	public Floresta(String nome, String tipo, float tamanho, int quantidade,String cor) {
		super(tipo, nome, tamanho, quantidade, cor);
		// TODO Auto-generated constructor stub
	}
   
	public Floresta() {
		super();
	}
	
	public String getFoha() {
		return folha;
		
	}
	
	public void setFolha( String folha ) {
		this.folha = folha;
		
	}
	
	public String getTronco() {
		return tronco;
		
	}
	
	public void setTronco( String tronco) {
		this.tronco = tronco;
	}
	
}
