package Jogo;

import java.util.ArrayList;

public class Fera extends Personagem implements Funcionalidade{

	int poder;
	float dano;
	
	ArrayList<Luta> lutas = new ArrayList<Luta>();
	
	public Fera(String nome, String raca, float vida) {
		super(nome, raca, vida);
		// TODO Auto-generated constructor stub
	}

	protected void atividadeFera() {
		mostrarStatus();
		realizarAtividadePrincipal();
		ataqueEdefesa();
		finalizarAcao();
		
	}
	
	/*public void realizarAtividadePrincipal() {
	 System.out.println(getNome() + " Estar lutando.");
		
	}
	
	public void ataqueEdefesa() {
		System.out.println(getNome() + " Estar se defendendo");
		
	}
	
	public String getInformacao() {
		return "Nome = " + getNome() + " Raca = " + getRaca() + " Vida = " + getVida(); 
		
	}
	
	public void finalizarAcao() {
		System.out.println(getNome() + " Finaliza sua acao.");
		
	}
	
	public void mostrarStatus() {
		System.out.println(getInformacao());
	
	}*/
	
	public int getPoder() {
		return poder;
		
	}
	
	public void setPoder(int poder) {
		this.poder = poder;
		
	}
	
	
	public float getDano() {
		return dano;
		
	}
	
	public void setDano(float dano) {
		this.dano = dano;
		
	}

	@Override
	public void treinar() {
		// TODO Auto-generated method stub
		System.out.println(getNome() + " Estar treinando.");
		
	}

	@Override
	public void aprenderMagia() {
		// TODO Auto-generated method stub
		System.out.println(getNome() + " Aprende magia");
		
	}

	@Override
	public void ataqueEdefesa() {
		// TODO Auto-generated method stub
		System.out.println(getNome() + " Estar se defendendo");
		
	}

	@Override
	public void mostrarStatus() {
		// TODO Auto-generated method stub
		System.out.println(getInformacao());
		
	}
	
	@Override
	public void finalizarAcao() {
		// TODO Auto-generated method stub
		System.out.println(getNome() + " finaliza sua acao");
	}

	@Override
	public void lancarMagia() {
		// TODO Auto-generated method stub
		System.out.println(getNome( )+ " lanca magia");
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println(getNome() + " estar correndo");
		
	}

	@Override
	public void nadar() {
		// TODO Auto-generated method stub
		System.out.println(getNome() + " estar nadando");
	}

	@Override
	public void morrer() {
		// TODO Auto-generated method stub
		System.out.println(getNome() + " morreu.");
	}

	@Override
	public void pular() {
		// TODO Auto-generated method stub
		System.out.println(getNome() + " estar pulando");
	}

	@Override
	public void voar() {
		// TODO Auto-generated method stub
		System.out.println(getNome() + " estar voando");
	}

	@Override
	public void realizarAtividadePrincipal() {
		// TODO Auto-generated method stub
		atividadeFera();
		
	}
	
	
}
