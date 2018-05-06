package Modelo2;

public abstract class Inventario {
  
	public String descricao;
	public String tipo;
	
	public Inventario( String descricao, String tipo) {
		this.descricao = descricao;
		this.tipo = tipo;
		
	}
	
	
	public String getDescricao() {
		return descricao;
		
	}
	
	public void setDescricao( String descricao) {
		this.descricao = descricao;
		
	}
	
	public String getTipo() {
		return tipo;
		
	}
	
	public void setTipo( String tipo) {
		this.tipo = tipo;
		
	}
	
	
}
