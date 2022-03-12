package Projeto;
import java.util.Scanner;

public class Cadastro {
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	
	Scanner leia = new Scanner(System.in);
	
	public Cadastro (String nome,String endereco,String telefone, String email)
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

	public void setNome() {
		this.nome = leia.next();
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco() {
		leia.next();
		this.endereco = leia.nextLine();
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone() {
		leia.next();
		this.telefone = leia.nextLine();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail() {
		leia.next();
		this.email = leia.nextLine();
	}
}
