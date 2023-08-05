package model;

public class Pais {
	String nome;
	String capital;
	
	
	public Pais(){}
	
	public Pais(String nome,String capital) {
		this.nome = nome;
		this.capital = capital;
	
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCapital(String capital) {	
		this.capital = capital;
	}
	
	public String getCapital() {
		return capital;
	}

	
}	
