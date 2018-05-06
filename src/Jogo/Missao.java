package Jogo;

import java.util.ArrayList;

public class Missao {
   protected String tipo;
   protected int quantidade;
   
   public Missao() {
	   this.tipo = tipo;
	   this.quantidade = quantidade;
   }
	
	public Missao( String tipo) {
		this.tipo = tipo;
		
	}
	
	public Missao( int quantidade) {
		this.quantidade = quantidade;
		
	}
	
   protected ArrayList<Luta> listaLuta = new ArrayList<Luta>();
	
	public ArrayList<Luta> getListaluta(){
		return listaLuta;
		
	}
	
	public void setListaluta( Luta luta) {
		listaLuta.add(luta);
		
	}
	
	protected ArrayList<MetodoLuta> metodos = new ArrayList<MetodoLuta>();
	
	public ArrayList<MetodoLuta> getMetodo(){
		return metodos;
		
	}
	
	public void setMetodo( MetodoLuta metodo) {
		metodos.add(metodo);
		
	}
	
	public String getTipo() {
		return tipo;
		
	}
	
	public void setTipo() {
		this.tipo = tipo;
		
	}
	
	
	
}
