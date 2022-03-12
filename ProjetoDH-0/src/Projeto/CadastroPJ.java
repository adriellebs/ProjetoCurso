package Projeto;
import java.util.Scanner;

public class CadastroPJ extends Cadastro {
	
	Scanner leia = new Scanner(System.in);
	private int cnpj;
	private String segmento;
	

	public CadastroPJ(String nome, String endereco, int telefone, 
			int cnpj, String segmento) {

		this.cnpj = cnpj;
		this.segmento = segmento;
	}


	public int getCnpj() {
		return cnpj;
	}


	public void setCnpj(int cnpj) {
		this.cnpj = leia.nextInt();
	}


	public String getSegmento() {
		return segmento;
	}


	public void setSegmento(String segmento) {
		this.segmento = leia.nextLine();
	}
}
