package Modelo1;

public class Lago extends Local{
	
	private int profundidade;
	private float comprimento;

	public Lago(String nome, String tipo, float tamanho, int quantidade, String cor) {
		super(tipo, nome, tamanho, quantidade, cor);
		// TODO Auto-generated constructor stub
	}
	
	public Lago() {
		super();
		
	}
	
	public int getProfundidade() {
		return profundidade;
		
	}
	
	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
		
	}
	
	public float getComprimento() {
		return comprimento;
		
	}
	
	public void setComprimento( float comprimento) {
		this.comprimento = comprimento;
		
	}
 
}
