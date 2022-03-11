package Projeto;

public class CadastroPF extends Pessoa{

	private String cpf;
	private String dataNascimento;
	
	
	public CadastroPF(String nome, String endereco, String telefone,String cpf, String dataNascimento) {
		super(nome, endereco, telefone); 
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;	
		
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}	

}
