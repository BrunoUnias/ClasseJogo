package Jogo;

import java.util.ArrayList;

public class Lutador extends Personagem implements Funcionalidade{

	protected int poder;
	protected float furia;

	ArrayList<Luta> lutas = new ArrayList<Luta>(); 
	ArrayList<MetodoLuta> metodoLutas = new ArrayList<MetodoLuta>();
	ArrayList<Mago> magos = new ArrayList<Mago>();
	ArrayList<Ninja> ninjas = new ArrayList<Ninja>();
    ArrayList<Cavaleiro>cavaleiros = new ArrayList<Cavaleiro>();
    ArrayList<Barbaro> barbaros = new ArrayList<Barbaro>();
    ArrayList<Fera> feras = new ArrayList<Fera>();
    ArrayList<MagiaHabilidade> magiaHabilidades = new ArrayList<MagiaHabilidade>();
	
	public Lutador() {
		super();
		
	}
	
	public Lutador(String nome, String raca, float vida) {
		super(nome, raca, vida);
		
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome( String nome) {
		this.nome = nome;
	}
	
	public int getPoder() {
		return poder;
			
	}

	public void setPoder(int poder) {
		this.poder = poder;
		
	}
	
	public float getFuria() {
		return furia;
		
	}
	
	public int getPoderDeBatalha() {
		return poder;
		
	}
	
	public String getInformacao() {
		return "Nome = " + getNome() + " Raca = " + getRaca() + " Vida = " + getVida();
		
	}
	
	protected void atividadeLutador() {
		 mostrarStatus();
		 realizarAtividadePrincipal();
		 andar();
		treinar();
		aprenderMagia();
		ataqueEdefesa();
		finalizarAcao();
		
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
		atividadeLutador();
		
	}

	/*public void lancaPoder() {
		
	}
	
	public void treinar() {
		System.out.println(getNome() + " Estar treinando.");
		
	}
	
	public void aprenderMagia() {
		System.out.println(getNome() + " Aprende magia");
	}

	@Override
	public void realizarAtividadePrincipal() {
		System.out.println(getNome() + " Estar lutando.");
			
	}
	
	public void ataqueEdefesa() {
		System.out.println(getNome() + " Estar se defendendo");
	}
	
	public void mostrarStatus() {
		System.out.println(getInformacao());
		
	}
	
	public String getInformacao() {
		return "Nome = " + getNome() + " Raca = " + getRaca() + " Vida = " + getVida(); 
		
	}
	
	public void finalizarAcao() {
		System.out.println(getInformacao());
		
	}
	
	public void Correr() {
		System.out.println(getNome() + " Estar correndo");
		
	}
	
	public void Nadar() {
		System.out.println(getNome() + " Estar Nadando");
		
	}
	
	public void pular() {
		System.out.println(getNome() + " Estar pulando");
		
	}
	
	public void Voar() {
		System.out.println(getNome() + " Estar voando");
		
	}
	
	public void Morrer() {
		System.out.println(getNome() + " Morreu");
	}*/
	
	ArrayList<MetodoLuta> getMetodo(){
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
