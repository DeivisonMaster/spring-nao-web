package br.com.model;

public class Usuario {
	private String nome;
	
	public Usuario() {
	}

	public Usuario(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Usuario [nome= " + this.nome + "]";
	}
}
