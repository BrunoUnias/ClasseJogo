package Jogo;

import java.util.ArrayList;

public class Luta {

	protected float dano;
	protected String luta;
	protected int quantidade;
	
	ArrayList<MetodoLuta> metodos = new ArrayList<MetodoLuta>();
	ArrayList<Luta> listaLuta = new ArrayList<Luta>();
	ArrayList<Missao> listaMissoes = new ArrayList<Missao>();
	
	
	public Luta( String luta) {
		this.luta = luta;
	}
	
	public Luta( int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Luta( Float dano) {
		this.dano = dano;
		
	}
	
	public float getDano() {
		return dano;
		
	}
	
	public void setDano(float dano) {
		this.dano = dano;
		
	}
	
	public ArrayList<MetodoLuta> getMetodo(){
		return metodos;
		
	}
	
	public void setMetodo( MetodoLuta metodo) {
		metodos.add(metodo);
		
	}

	public ArrayList<Luta> getListaluta() {
		return listaLuta;
		// TODO Auto-generated method stub
		
	}
	
	public void setListaluta( Luta luta) {
		listaLuta.add(luta);
		
	}
	
	public ArrayList<Missao> getMissao(){
		return listaMissoes;
		
	}
	
	public void setMissao( Missao missao) {
		listaMissoes.add(missao);
		
	}
	
}

