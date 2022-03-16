package Projeto;

import java.util.Scanner;

public class CadastroPJ extends Cadastro {
	
	//ATRIBUTOS////////////////////////////////////////////////////////////////////////////////
	private String cnpj;
	private String segmento;
	
	//CONSTRUTORES///////////////////////////////////////////////////////////////////////////////
	public CadastroPJ(String nome , String cnpj, String segmento) 
	{
		super(nome);
		this.cnpj = cnpj;
		this.segmento = segmento;
		
	}
	
	public CadastroPJ() {
		
	}
	
	//GETTERS AND SETTERS/////////////////////////////////////////////////////////////////////////////////////////
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
	
	//OUTRAS FUNÇÕES
	public void validarCnpj()
	{
		Scanner leia = new Scanner(System.in);
		while (this.getCnpj().length() != 14)
		{
			System.out.println("\nCNPJ Inválido! Digite seu CNPJ (sem ponto e traço):");
			this.cnpj = leia.nextLine();
		}
		
	}
	
}
