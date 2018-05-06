package Modelo1;

public class Motanha extends Local{
     
	public int altura;
	public float comprimento;
	
	public Motanha() {
		super();
		
	}
	
	public Motanha(String nome, String tipo, float tamanho, int quantidade,String cor) {
		super(tipo, nome, tamanho, quantidade, cor);
		// TODO Auto-generated constructor stub
	}
	
	public int getAltura() {
		return altura;
		
	}
	
	public void setAltura( int altura) {
		this.altura = altura;
		
	}
	
	public float getComprimento() {
		return comprimento;
		
	}
	
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
		
	}
	
}
