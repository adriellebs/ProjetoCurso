package Projeto;

import java.util.Scanner;

public class CadastroPJ extends Cadastro {
	
	
	private String cnpj;
	private String segmento;
	
	public CadastroPJ() 
	{
		
	}

	public String getCnpj() 
	{
		return cnpj;
	}

	public void setCnpj(String cnpj) 
	{
		this.cnpj = cnpj;
	}

	public String getSegmento() 
	{
		return segmento;
	}

	public void setSegmento(String segmento) 
	{
		this.segmento = segmento;
	}
	
	public void validarCnpj()
	{
		Scanner leia = new Scanner(System.in);
		while (this.getCnpj().length() != 14)
		{
			System.out.println("\nCNPJ Inválido! Digite seu CNPJ (sem ponto e traço):");
			this.cnpj = leia.nextLine();
		}
		
	}

	@Override
	public String toString() {
		return "CadastroPJ [cnpj=" + cnpj + ", segmento=" + segmento + "]";
	}
	
	
}
