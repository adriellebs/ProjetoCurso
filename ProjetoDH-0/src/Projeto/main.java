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
		cad.setNome("nome");
		
		System.out.println("\nQual o seu endere�o?");
		cad.setEndereco("endere�o");
		
		System.out.println("\nInforma pra a gente o seu telefone com ddd: ");
		cad.setTelefone("11");
		
		System.out.println("\nInforma tamb�m um endere�o de email, por favor? ");
		cad.setEmail("email");
		
		System.out.println("\nVoc� � uma pessoa f�sica ou jur�dica?\nDigite o n�mero equivalente:\n 1 - PF\n 2 - PJ");
		int pessoa = leia.nextInt();
		
		switch(pessoa) {
		case 1:
			CadastroPF.setTipoDePessoa("Pessoa F�sica");
			System.out.println("\nQual o seu CPF?");
			CadastroPF.setCpf("444");
			
			System.out.println("\nDigite a sua data de nascimento: ");
			CadastroPF.setNascimento("data");
			
			System.out.println("\nNos informe com qual g�nero voc� se identifica?\n1 - Feminino\n2 - Masculino\n 3 - N�o bin�rio");
			int escolha = leia.nextInt();
			
			switch(escolha) {
			case 1:
				CadastroPF.setGenero("Feminino");
			break;
			case 2:
				CadastroPF.setGenero("Masculino");
			break;
			case 3:
				CadastroPF.setGenero("N�o bin�rio");
			break;
			}
			curso.escolherCurso();
			
			System.out.println("Voc� � professor ou aluno?"); //parei aqui
		break;
		case 2: 
			CadastroPF.setTipoDePessoa("Pessoa Juridica");
			System.out.println("");
		break;
		}	
			
	}
 // falta fazer a pessoa juridica tbm
}
