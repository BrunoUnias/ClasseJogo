package Jogo;

import java.util.ArrayList;

public abstract class Magia extends MagiaHabilidade{

	ArrayList<Mago> magos = new ArrayList<Mago>(); 
	
	public Magia(float dano, String nome) {
		super(dano, nome);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Mago> getMago(){
		return magos;
	}
	
	public void setMago(Mago mago) {
		magos.add(mago);
		
	}
	
	
	
	public float getDano() {
		return dano;
		
	}
	
    public void setDano(float dano) {
    	if(dano <= 10.0f && dano >= 50) {
    		System.out.println(getNome() + " e lancada,");
    		
    	}
    	else {
    		System.out.println("esse poder nao pode ser lancado.");
    		
    	}
    	
    }

	public void lancarMagia() {
		System.out.println(getNome() + " e lancada");
		
	}
    
}
