package Projeto;

public class CadastroPF extends ProjetoCurso{

	private int cpf;
	private String nascimento;
	
	
	public CadastroPF(String nome, String endereco, int telefone,
			int cpf, String nascimento) 
	{
		super(nome, endereco, telefone); 
		this.cpf = cpf;
		this.nascimento = nascimento;
		
		
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public String getNascimento() {
		return nascimento;
	}


	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	
	
	
	

}
