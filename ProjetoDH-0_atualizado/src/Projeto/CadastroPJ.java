package Projeto;
import java.util.Scanner;

public class CadastroPJ extends Cadastro {
	
	
	private String cnpj;
	private String segmento;
	
	public CadastroPJ() {
		
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
