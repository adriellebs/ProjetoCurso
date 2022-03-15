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
		
		System.out.println("\nOlá! Preencha com as suas informações: ");
		System.out.println("\nEndereço: ");
		cad.setEndereco();
		
		System.out.println("\nTelefone com DDD: ");
		cad.setTelefone();
		
		System.out.println("\nE-mail: ");
		cad.setEmail();
		
		System.out.println("\nVocê é pessoa física ou jurídica?"
				+ "\nDigite a opção correspondente:"
				+ "\n1 - PF"
				+ "\n2 - PJ");
		int pessoa = leia.nextInt();
		
		switch(pessoa) {
		case 1:
			CadastroPF.setTipoDePessoa();
			System.out.println("\nDigite seu CPF (sem ponto e vírgula): ");
			CadastroPF.setCpf();
			CadastroPF.validarCpf();
			
			System.out.println("\nData de nascimento: ");
			CadastroPF.setNascimento();
			
			System.out.println("\nGênero: "
					+ "\n1 - Feminino"
					+ "\n2 - Masculino"
					+ "\n3 - Não binário");
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
			
			System.out.println("Você é professor ou aluno?"); //parei aqui
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
