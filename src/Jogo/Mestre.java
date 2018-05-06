package Jogo;

import java.util.ArrayList;

public class Mestre  extends Exception {
	protected String nome;
	protected int num = 0;
	
	ArrayList<Luta> lutas = new ArrayList<Luta>(); 
	ArrayList<MetodoLuta> metodoLutas = new ArrayList<MetodoLuta>();
	ArrayList<Mago> magos = new ArrayList<Mago>();
	ArrayList<Ninja> ninjas = new ArrayList<Ninja>();
    ArrayList<Cavaleiro>cavaleiros = new ArrayList<Cavaleiro>();
    ArrayList<Barbaro> barbaros = new ArrayList<Barbaro>();
    ArrayList<Fera> feras = new ArrayList<Fera>();
    ArrayList<MagiaHabilidade> magiaHabilidades = new ArrayList<MagiaHabilidade>();
	ArrayList<Lutador> lutador1 = new ArrayList<Lutador>();
    
    public Mestre() {
    	this.nome = nome;
    	
    }
    
    
	public Mestre( String nome) {
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome( String nome) {
	  this.nome = nome;
		
	}
	
	public void criarJogo() {
		System.out.println(" 1- quantidade de jogadores 2- escrever jogadores");
		int opcao = 0;
		
		if(opcao == 1) {
			if( num < 1 && num > 5) {
				erroQuantidade();
				
			}
		}
		
		else if( opcao == 2) {
			
		}
	}
	
	public ArrayList<Lutador> getLutador(){
		return lutador1;
		
	}
	
	public void setLutador(Lutador lutador) {
		for(Lutador lutadores : lutador1) {
			
		}
	}

	public ArrayList<MetodoLuta> getMetodo(){
		return metodoLutas;
		
	}
	
	public void setMetodo(MetodoLuta metodo) {
		metodoLutas.add(metodo);
		
	}
	
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
		
		public ArrayList<MagiaHabilidade> getMagiaeHabilidade(){
			return magiaHabilidades;
			
		}
		
		public void setMagiaeHabilidade(MagiaHabilidade magiaHabilidade) {
			magiaHabilidades.add(magiaHabilidade);
			
		}
	
}
