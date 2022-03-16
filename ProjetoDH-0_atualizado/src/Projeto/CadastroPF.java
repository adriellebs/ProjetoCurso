package Projeto;

import java.util.Scanner;

public class CadastroPF extends Cadastro {
	//ATRIBUTOS DE CLASSE
	private String cpf;
	private String nascimento;
	private String genero;
	
	//Constructores////////////////////////////////////////////////////////////////////
	public CadastroPF() {
		super();
	}

	public CadastroPF(String cpf, String nascimento, String genero) {
		super();
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.genero = genero;
	}
	
	public CadastroPF(String nome,String cpf, String nascimento, String genero) {
		super(nome);
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.genero = genero;
	}
	public CadastroPF(String nome) {
		super(nome);
	}

	
	//GETTER AND SETTERS///////////////////////////////////////////////////////////////////
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	//////////////////////// Outras funções
	
	public void validarCpf(){
		Scanner leia = new Scanner(System.in);
		while (this.getCpf().length() != 11){
			System.out.println("\nCPF Inválido! Digite seu CPF (sem ponto e traço):");
			this.cpf = leia.nextLine();
		}
		
	}
	
}
