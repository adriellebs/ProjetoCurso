package Projeto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cadastro cad = new Cadastro();
		CadastroPF CadastroPF = new CadastroPF();
		Cursos curso = new Cursos();
		

		System.out.println("\n\t\t----------- Seja bem-vindo(a) a Digital House Brasil! ----------- "
				+ "\n\t\t--------- Por favor, nos informe o seu nome para iniciar. ------- ");
		cad.setNome();
		
		System.out.println("\nOl�! Preencha com as suas informa��es: ");
		System.out.println("\nEndere�o: ");
		cad.setEndereco();
		
		System.out.println("\nTelefone com DDD: ");
		cad.setTelefone();
		
		System.out.println("\nE-mail: ");
		cad.setEmail();
		
		System.out.println("\nVoc� � pessoa f�sica ou jur�dica?"
				+ "\nDigite a op��o correspondente:"
				+ "\n1 - PF"
				+ "\n2 - PJ");
		int pessoa = leia.nextInt();
		
		switch(pessoa) {
		case 1:
			CadastroPF.setTipoDePessoa();
			System.out.println("\nDigite seu CPF (sem ponto e v�rgula): ");
			CadastroPF.setCpf();
			CadastroPF.validarCpf();
			
			System.out.println("\nData de nascimento: ");
			CadastroPF.setNascimento();
			
			System.out.println("\nG�nero: "
					+ "\n1 - Feminino"
					+ "\n2 - Masculino"
					+ "\n3 - N�o bin�rio");
			int escolha = leia.nextInt();
			
			switch(escolha) {
			case 1:
				CadastroPF.setGenero();
			break;
			case 2:
				CadastroPF.setGenero();
			break;
			case 3:
				CadastroPF.setGenero();
			break;
			}
			curso.escolherCurso();
			
			System.out.println("Voc� � professor ou aluno?"); //parei aqui
		break;
		case 2: 
			CadastroPF.setTipoDePessoa();
			System.out.println("");
		break;
		}
		leia.close();
		
	}
 // falta fazer a pessoa juridica tbm
	
	
		
	
		

	private static String setNome() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
}
