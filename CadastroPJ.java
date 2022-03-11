package Projeto;

public class CadastroPJ extends Pessoa{
	
	private String cnpj;
	private String segmento;
	

	public CadastroPJ(String nome, String endereco, String telefone, String cnpj, String segmento) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.segmento = segmento;
		
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getSegmento() {
		return segmento;
	}


	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	
}
