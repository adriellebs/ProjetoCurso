package Projeto;
import java.util.Scanner;

public class CadastroPJ extends Cadastro {
	
	Scanner leia = new Scanner(System.in);
	private String cnpj;
	private String segmento;
	

	public CadastroPJ(String nome, String endereco, String telefone,String email,String cnpj, String segmento) {
		
		super(nome,endereco,telefone,email);
		this.cnpj = cnpj;
		this.segmento = segmento;
		
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(int cnpj) {
		leia.next();
		this.cnpj = leia.nextLine();
	}


	public String getSegmento() {
		return segmento;
	}


	public void setSegmento() {
		leia.next();
		this.segmento = leia.nextLine();
	}
}
