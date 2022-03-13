package Projeto;

import java.util.Scanner;

public class CadastroPF extends Cadastro {
	
	private String cpf;
	private String nascimento;
	private String genero;
	
	public CadastroPF() {
		super();
	}

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

	@Override
	public String toString() {
		return "Nome:" + this.nome +" Endereco: " +this.endereco
				+ " Telefone: "+this.telefone +"Email: " + this.email 
				+"\n CPF: "+this.cpf+" Genero: "+this.genero+" Nascimento: "+this.nascimento;
				
	}
	
	public void validarCpf(){
		Scanner leia = new Scanner(System.in);
		while (this.getCpf().length() != 11){
			System.out.println("\nCPF Inválido! Digite seu CPF (sem ponto e vírgula):");
			this.cpf = leia.nextLine();
		}
		
	}
	
}
