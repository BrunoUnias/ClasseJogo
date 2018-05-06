package Jogo;

import java.util.ArrayList;

public class MagiaHabilidade {
 protected float dano;
 protected String nome;
 
 ArrayList<Mago> magos = new ArrayList<Mago>();
 ArrayList<Ninja> ninjas = new ArrayList<Ninja>();
 ArrayList<Cavaleiro>cavaleiros = new ArrayList<Cavaleiro>();
 ArrayList<Barbaro> barbaros = new ArrayList<Barbaro>();
 ArrayList<Fera> feras = new ArrayList<Fera>();
 
 public ArrayList<Mago> getMago(){
	 return magos;
	 
 }
 
 public void setMago(Mago mago) {
	 magos.add(mago);
	 
 }
 
	public ArrayList<Ninja> getNinja(){
		return ninjas;
	}
	
	public void setNinja(Ninja ninja) {
		ninjas.add(ninja);
		
	}
	
	public ArrayList<Cavaleiro> getCavaleiro(){
		return cavaleiros;
	}
	
	public void setCavaleiros(Cavaleiro cavaleiro) {
		cavaleiros.add(cavaleiro);
		
	}
	
	public ArrayList<Barbaro> getBarbaro(){
		return barbaros;
	}
	
	public void setBarbaro(Barbaro barbaro) {
		barbaros.add(barbaro);
		
	}
	
	public ArrayList<Fera> getFera(){
		return feras;
		
	}
	
	public void setFera(Fera fera) {
		feras.add(fera);
		
	}
	
 public MagiaHabilidade(float dano, String nome) {
	 this.dano = dano;
	 this.nome = nome;
 }
 
  public float getDano() {
	return dano;
	  
  }
  
  public void setDano(float dano) {
	  this.dano = dano;
	  
  }
  
  public String getNome() {
	return nome;
	  
  }
  
  public void setNome(String nome) {
	  this.nome = nome;
	  
  }
  
  private ArrayList<Personagem> personagem = new ArrayList<Personagem>();
  private Mago mago = new Mago(nome, nome, dano);
  private Ninja ninja = new Ninja(nome, nome, dano);
  private Barbaro barbaro = new Barbaro(nome, nome, dano);
  private Cavaleiro cavaleiro = new Cavaleiro(nome, nome, dano);
  
  
 
}
