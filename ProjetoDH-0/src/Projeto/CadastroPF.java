package Projeto;
import java.util.Scanner;

public class CadastroPF extends Cadastro {
	
	Scanner leia = new Scanner(System.in);
	private String cpf;
	private String nascimento;
	private String genero;
	private String tipoDePessoa;
	
	
	public CadastroPF(String nome, String endereco, String telefone,String email, String cpf, String nascimento, String genero, String tipoDePessoa) 
	{
		super(nome,endereco,telefone,email);
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
		leia.next();
		this.cpf = leia.nextLine();
	}


	public String getNascimento() {
		return nascimento;
	}


	public void setNascimento() {
		leia.next();
		this.nascimento = leia.nextLine();
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero() {
		leia.next();
		this.genero = leia.nextLine();
	}


	public String getTipoDePessoa() {
		return tipoDePessoa;
	}

	public void setTipoDePessoa() {
		this.tipoDePessoa = leia.nextLine();
	}
	
	public void validarCpf()
	{
		while (getCpf().length()!=11)
		{
			System.out.println("\nCPF Inválido! Digite seu CPF (sem ponto e vírgula):");
			this.cpf = leia.nextLine();
		}
	}
}
