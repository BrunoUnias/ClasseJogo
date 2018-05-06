package Jogo;

import java.util.ArrayList;

public class Ninja extends Lutador{

	ArrayList<Luta> lutas = new ArrayList<Luta>();
	
	public Ninja() {
		super();
		
	}
	
	public Ninja(String nome, String raca, float vida) {
		super(nome, raca, vida);
		
	}
	
	private ArrayList<Lutador> lutadores = new ArrayList<Lutador>();
	
	public ArrayList<Lutador> getLutador(){
		return lutadores;
		
	}
	
	public void setLutador(Lutador lutador) {
		//lutador = ninja;
		lutadores.add(lutador);
		
	}
	
	public int getPoder() {
		return poder;
		
	}
	
	public void setPoder(int poder) {
		if(poder <= 500){
			this.poder = poder;
			
		}else {
			System.out.println("Esse poder nao e permitido.");
			
		}
		
		}
	
	public float getFuria() {
		return furia;
		
	}

	public void setFuria(float furia) {
		if(furia <= 2.0) {
		this.furia = furia;
		}else {
			System.out.println("Esta furia nao e permitido.");
			
		}
		
	}
	
	public void facada() {
		if(poder <= 500 && furia <= 2.0) {
			System.out.println("Facada realizaada.");
			
		}else {
			System.out.println("Facada nao pode ser realizada.");
		}
	}
	
	//Ninja ninja = new Ninja("Kusanagi", "Humana", 120.0f);
	
}
