package Modelo1;

import java.util.ArrayList;

public class SuperCenario extends Cenario {
	
	protected String nome;

	ArrayList<Local> listaLocal = new ArrayList<Local>();
	ArrayList<SuperCenario> supercenario = new ArrayList<SuperCenario>();
	ArrayList<Cidade> cidades = new ArrayList<Cidade>();
	
	public ArrayList<Local> getListaLocal(){
		return listaLocal;
		
	}
	
	public void setListaLocal( Local local) {
		listaLocal.add(local);
		
	}
	
	public ArrayList<SuperCenario> getSuperCenario(){
		return supercenario;
		
	}
	
	public void setSuperCenario( SuperCenario sc) {
		supercenario.add(sc);
		
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome( String nome) {
		this.nome = nome;
		
	}
	
	public ArrayList<Cidade> getCidade(){
		return cidades;
		
	}
	
	public void setCidade( Cidade cidade) {
		cidades.add(cidade);
		
	}
	
}
