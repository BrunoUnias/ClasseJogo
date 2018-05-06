package Jogo;

public abstract class Personagem {
	protected String nome;
	protected String raca;
	protected float vida;
	
	public Personagem() {
		this.nome = nome;
		this.raca = raca;
		this.vida =  vida;
				
	}
	
	public Personagem(String nome, String raca, float vida) {
		this.nome = nome;
		this.raca = raca;
		this.vida = vida;
		
	}
	
	public abstract void realizarAtividadePrincipal();
	
	public String getNome() {
		return nome;
		
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public String getRaca() {
		return raca;
		
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
		
	}
	
	public float getVida() {
		return vida;
		
	}
	
	public void setVida(float vida) {
		this.vida = vida;
	}
	
	public String getInformacao() {
		return "Nome = " + getNome() + "Raca = " + getRaca() + "Vida = " + getVida();
	}
	
	public void andar() {
		System.out.println(getNome() + " Estar andando. ");
	}
}
