package Modelo1;

public abstract class Cenario {
	protected String nome;
	protected String cor;
	protected String tipo;
	protected float tamanho;
	protected int quantidade;
	
	public Cenario() {
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.quantidade = quantidade;
		this.cor = cor;
		
	}
	
	public Cenario( String nome, String tipo, float tamanho, int quantidade, String cor) {
		this.nome = nome;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.quantidade = quantidade;
		this.cor = cor;
		
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome( String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
		
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
		
	}
	
	public float getTamanho() {
		return tamanho;
		
	}
	
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
		
	}
	
	public int getQuantidade() {
		return quantidade;
		
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		
	}
	
	public String getCor() {
		return cor;
		
	}
	
	public void setCor( String cor) {
		this.cor = cor;
		
	}
	
	public String getInformacao() {
		return "Tipo = " + getTipo() + " Tamanho = " + getTamanho() + " Quantidade = " + getQuantidade();
		
	}
	
}
