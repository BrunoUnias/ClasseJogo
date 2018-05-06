package Modelo1;

import java.util.ArrayList;

public class Cidade extends Local{
	
	public int altura;
	public int comprimento;
	public int largura;
	public int profundidade;
	
	
	
	public Cidade(String nome, String tipo, float tamanho, int quantidade,String cor) {
		super(tipo, nome, tamanho, quantidade, cor);
		// TODO Auto-generated constructor stub
	}
	
	public Cidade() {
		super();
		
	}
	
	ArrayList<Habitacao> habitacao = new ArrayList<Habitacao>();  
	
	public int getAltura() {
		return altura;
		
	}
	
	public void setAltura( int altura) {
		this.altura = altura;
		
	}
	
	public int getComprimento() {
		return comprimento;
		
	}
	
	public void setComprimento( int comprimento) {
		this.comprimento = comprimento;
		
	}
	
	public int getLargura() {
		return largura;
		
	}
	
	public void setLargura( int largura) {
		this.largura = largura;
		
	}
	
	public int getProfundidade() {
		return profundidade;
		
	}
	
	public void setProfundidade( int profundidade) {
		this.profundidade = profundidade;
		
	}
	
  public ArrayList<Habitacao> getHabitacao(){
	  return habitacao;
	  
  }
  
  public void setHabitacao( Habitacao habitacoes) {
	 habitacao.add(habitacoes);
	 
  }
	
	
}
