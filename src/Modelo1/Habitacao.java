package Modelo1;

public class Habitacao extends Cidade{
	
	public String janela;
	public String porta;
	public String quarto;
	public String sala;
	public String cozinha;
	public String porao;
	public String sotao;
	
	public Habitacao() {
		super();
		
	}

	public Habitacao(String nome, String tipo, float tamanho, int quantidade, String cor) {
		super(tipo, nome, tamanho, quantidade, cor);
		// TODO Auto-generated constructor stub
	}

	
	public String getJanela() {
		return janela;
		
	}
	
	public void setJanela( String janela) {
		this.janela = janela;
		
	}
	
	public String getPorta() {
		return porta;
		
	}
	
	public void setPorta( String porta) {
		this.porta = porta;
		
	}
	
	public String getQuarto() {
		return quarto;
		
	}
	
	public void setQuarto( String quarto) {
		this.quarto = quarto;
		
	}
	
	public String getSala() {
		return sala;
		
	}
	
	public void setSala( String sala) {
		this.sala = sala;
		
	}
	
	public String getCozinha() {
		return cozinha;
		
	}
	
	public void setCozinha( String cozinha) {
		this.cozinha = cozinha;
		
	}
	
	public String getPorao() {
		return porao;
		
	}
	
	public void setPorao( String porao) {
		this.porao = porao;
		
	}
	
	public String getSotao() {
		return sotao;
		
	}
	
	public void setSotao( String sotao) {
		this.sotao = sotao;
		
	}
	
	public String getInformacao() {
		return " Janela = " + getJanela() 
		+ " porta = " 	+ getPorta() 
		+ " quarto = " + getQuarto()
		+ " sala = " + getSala() 
		+ " cozinha = " + getCozinha() 
		+ "porao = " + getPorao() 
		+ " sotao = " + getSotao() ;
		
	}
	
}
