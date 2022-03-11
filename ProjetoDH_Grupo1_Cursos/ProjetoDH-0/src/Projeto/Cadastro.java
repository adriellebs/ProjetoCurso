package Projeto;
import java.util.Scanner;

public class Cadastro {
	private String nome;
	private String endereco;
	private int telefone;
	private String email;
	
	Scanner leia = new Scanner(System.in);
	
	public Cadastro (String nome,String endereco,int telefone, String email)
	{
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		
	}

	public Cadastro() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = leia.nextLine();
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = leia.nextLine();
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = leia.nextInt();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = leia.nextLine();
	}
}
