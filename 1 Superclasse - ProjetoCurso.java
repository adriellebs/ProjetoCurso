package Projeto;

import java.util.Scanner;

public class ProjetoCurso {
	
	private String nome;
	private String endereco;
	private int telefone;
	
	public ProjetoCurso (String nome,String endereco,int telefone)
	{
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public ProjetoCurso (String nome)
	{
		this.nome = nome; 
	}
	
	
	
	
}
