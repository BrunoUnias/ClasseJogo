package Jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class Mago extends Lutador{
   
	ArrayList<Luta> lutas = new ArrayList<Luta>();
	ArrayList<Magia> magias = new ArrayList<Magia>();
	
	public Mago() {
		super();
	}
	
	public Mago(String nome, String raca, float vida) {
		super(nome, raca, vida);
	}
	
	public int getPoder() {
		return poder;
		
	}
	
	public void setPoder(int poder) {
		if(poder <= 1000) {
			this.poder = poder;
			
		}else {
			System.out.println("Este poder nao e permitido.");
			
		}
		
	}
	
	public float getFuria() {
		return furia;
		
	}
	
	public String getInformacao() {
		return "Nome = " + getNome() + " Raca = " + getRaca() + " Vida = " + getVida();
		
	}
	
	public void setFuria(float furia) {
		if(furia <= 1.0) {
			this.furia = furia;
			
		}else {
			System.out.println("Esta furia nao e permitido.");
			
		}
		
	}
	
	public void AtaqueMagico() {
		if(poder <= 1000 && furia <= 1.0) {
			System.out.println("Ataque magico realizado.");
			
		}else {
			System.out.println("Ataque magico nao pode ser realizado.");
		}
		
	}
	
	ArrayList<Magia> getMagia(){
		return magias;
		
	}
	
	public void setMagia(Magia magia) {
		magias.add(magia);
		
	}
	
	public void CriarMago() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o nome do mago");
		setNome(leitor.next());
		System.out.println("informe a raca");
		setRaca(leitor.next());
		System.out.println("informe a vida");
		setVida(leitor.nextFloat());
		System.out.println("informe a furia");
		setFuria(leitor.nextFloat());
		System.out.println("informe o poder");
		setPoder(leitor.nextInt());
		
	}

	
}
