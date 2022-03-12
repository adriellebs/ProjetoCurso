package Projeto;
import java.util.Scanner;

public class CadastroPF extends Cadastro {
	
	Scanner leia = new Scanner(System.in);
	private String cpf;
	private String nascimento;
	private String genero;
	private String tipoDePessoa;
	
	
	public CadastroPF(String nome, String endereco, String telefone, String cpf, String nascimento, String genero, String tipoDePessoa) 
	{
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.genero = genero;
		this.tipoDePessoa = tipoDePessoa;
	}


	public CadastroPF() {
	
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf() {
		this.cpf = leia.nextLine();
	}


	public String getNascimento() {
		return nascimento;
	}


	public void setNascimento(String nascimento) {
		this.nascimento = leia.nextLine();
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = leia.nextLine();
	}


	public String getTipoDePessoa() {
		return tipoDePessoa;
	}

	public void setTipoDePessoa(String tipoDePessoa) {
		this.tipoDePessoa = tipoDePessoa;
	}
	
	public void validarCpf()
	{
		while (getCpf().length()!=11)
		{
			System.out.println("\nCPF Inv�lido! Digite seu CPF (sem ponto e v�rgula):");
			this.cpf = leia.nextLine();
		}
	}
}
