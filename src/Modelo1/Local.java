package Modelo1;

import java.util.ArrayList;

public class Local extends Cenario{
	protected String horario;
	protected String tempo;
	protected int hora; 
	
	ArrayList<Floresta> florestas = new ArrayList<Floresta>();
	ArrayList<Lago> lagos = new ArrayList<Lago>();
	ArrayList<Motanha> motanhas = new ArrayList<Motanha>();
	ArrayList<Cidade> cidades = new ArrayList<Cidade>();
	ArrayList<Caverna> cavernas = new ArrayList<Caverna>();
	
   public Local( String nome, String tipo, float tamanho, int quantidade,String cor) {
	   super(nome, tipo,tamanho,quantidade,cor);
	   
   }
   
   public Local() {
		super();
		
	}
   
   public String getHorario() {
	return horario;
	   
   }
   
   public void setHorario(String horario) {
	   this.horario = horario;
	   
   }
   
   public String getTempo() {
	return tipo;
	   
   }
   
   public void setTempo(String tempo) {
	   this.tempo = tempo;
	   
   }
   
   public int getHora() {
	   return hora;
	   
   }
   
   public void setHora( int hora) {
	   this.hora = hora;
	   
   }
   
   public ArrayList<Floresta> getFloresta(){
	return florestas;
	   
   }
   
   public void setFloresta( Floresta floresta){
	   florestas.add(floresta);
	   
   }
   
   public ArrayList< Lago> getLago(){
	return lagos;
	   
   }
   
   public void setLago( Lago lago) {
	   lagos.add(lago);
	   
   }
   
   public ArrayList<Caverna> getCaverna(){
	return cavernas;
	   
   }
   
   public void setCaverna( Caverna caverna) {
	   cavernas.add(caverna);
	   
   }
   
   public ArrayList<Motanha> getMotanha(){
	return motanhas;
	   
   }
   
   public void setMotanha( Motanha motanha) {
	   motanhas.add(motanha);
	   
   }
   
   public ArrayList<Cidade> getCidade(){
	return cidades;
	   
   }
   
   public void setCidade( Cidade cidade) {
	   cidades.add(cidade);
	   
   }
   
}
