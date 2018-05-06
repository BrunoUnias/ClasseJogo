package Modelo1;

public class Caverna extends Local{
	
	public int profundidade;
	public int piso;

	public Caverna() {
		super();
		
	}
	
	public Caverna( String nome, String tipo, float tamanho, int quantidade,String cor) {
		super(tipo, nome, tamanho, quantidade, cor);
		// TODO Auto-generated constructor stub
	}
	
	public int getProfundidade() {
		return profundidade;
		
	}
	
	public void setProfundidade( int profundidade) {
		this.profundidade = profundidade;
		
	}
	
	public int getPiso() {
		return piso;
		
	}
	
	public void setPiso( int piso) {
		this.piso = piso;
	}
	
}
