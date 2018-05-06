package Jogo;

import java.util.ArrayList;

public class MetodoLuta {

	protected String descricao;
	protected String nome;
	
	
	private ArrayList<Missao> listaMissoes = new ArrayList<Missao>();
	private ArrayList<Luta> listaLuta = new ArrayList<Luta>();
	private ArrayList<MetodoLuta> metodos = new ArrayList<MetodoLuta>();
	
	public String getDescricao() {
		return descricao;
		
	}
	
	public void setDescricao( String descricao) {
		this.descricao = descricao;
		
	}
	
	public ArrayList<Luta> getListaluta(){
		return listaLuta;
		
	}
	
	public void setListaluta( Luta luta) {
		listaLuta.add(luta);
		
	}
	
	public ArrayList<Luta> getMetodoLuta(){
		return listaLuta;
		
	}
	
	public void setMetodoLuta(Luta luta) {
		listaLuta.add(luta);
		
	}

	public ArrayList<Missao> getMissao() {
		// TODO Auto-generated method stub
		return listaMissoes;
		
	}
	
	public void setMissao( Missao missao) {
		listaMissoes.add(missao);
		
	}
	
	public ArrayList<MetodoLuta> getMetodo(){
		return metodos;
		
	}
	
	public void setMetodo(MetodoLuta metodo ) {
		metodos.add(metodo);
	}
	
	public String getNome() {
		return nome;
		
	}

	public void setNome( String nome) {
		this.nome = nome;
		
	}
	
	
}
