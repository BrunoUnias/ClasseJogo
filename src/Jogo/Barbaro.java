package Jogo;

import java.util.ArrayList;

public class Barbaro extends Lutador{

	ArrayList<Luta> lutas = new ArrayList<Luta>();
	
	public Barbaro(String nome, String raca, float vida) {
		super(nome, raca, vida);
		// TODO Auto-generated constructor stub
	}
	
	public int getPoder() {
		return poder;
		
	}
	
	public void setPoder(int poder) {
		if(poder <= 700) {
			this.poder = poder;
		}else {
			System.out.println("Esse poder nao e permitido.");
		}
		
	}

	public float getFuria() {
		return furia;
		
	}
	
	public void setFuria(float furia) {
		if(furia <= 5.0f) {
			this.furia = furia;
			
		}else {
			System.out.println("Essa furia nao e permitida.");
		}
	}
	
	public void AtaqueMachado() {
		if(poder == 700 && furia == 5.0f) {
			System.out.println("Machadada realizada.");
			
		}else {
			System.out.println("Machadada nao pode ser realizada.");
			
		}
	}
	
}
