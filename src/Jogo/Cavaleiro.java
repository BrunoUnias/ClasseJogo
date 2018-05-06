package Jogo;

import java.util.ArrayList;

public class Cavaleiro extends Lutador{

	ArrayList<Luta> lutas = new ArrayList<Luta>();
	
	public Cavaleiro(String nome, String raca, float vida) {
		super(nome, raca, vida);
		// TODO Auto-generated constructor stub
	}
	
	public int getPoder() {
		return poder;
		
	}
	
	public void setPoder(int poder) {
		if(poder <= 800) {
			this.poder = poder;
			
		}else {
			System.out.println("Esse poder nao e permitido.");
			
		}
		
	}
	
	public float getFuria() {
		return furia;
		
	}
	
	public void setFuria(float furia) {
		if(furia <= 5) {
			this.furia = furia;
			
		}else {
			System.out.println("Essa furia nao e permitida.");
			
		}
		
		}
		
		public void ataqueDeEspada() {
			if(poder <= 800 && furia <= 5) {
				System.out.println("Espadada realizada.");
				
		}else {
			System.out.println("Espadada nao pode ser realizada.");
		}
			
		
	}
	
}
