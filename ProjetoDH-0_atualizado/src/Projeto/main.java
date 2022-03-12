package Projeto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cadastro cad = new Cadastro();
		CadastroPF CadastroPF = new CadastroPF();
		Cursos curso = new Cursos();
		//teste
		curso.escolherCurso();
		
		System.out.println("\n\t\t----------- Seja bem-vindo(a) a Digital House Brasil! ----------- "
				+ "\n\t\t--------- Por favor, nos informe o seu nome para iniciar. ------- ");
		cad.setNome("nome");
		
		System.out.println("\nQual o seu endereço?");
		cad.setEndereco("endereço");
		
		System.out.println("\nInforma pra a gente o seu telefone com ddd: ");
		cad.setTelefone("11");
		
		System.out.println("\nInforma também um endereço de email, por favor? ");
		cad.setEmail("email");
			
		// teste System.out.println("Seu nome é: " + cad.getNome() + " seu email é: " + cad.getEmail() + "seu endereço é: " + cad.getEndereco() + ", e seu telefone é: " + cad.getTelefone());
		
		System.out.println("\nVocê é uma pessoa física ou jurídica?\nDigite o número equivalente:\n 1 - PF\n 2 - PJ");
		int pessoa = leia.nextInt();
		
	
		
		switch(pessoa) {
		case 1:
			CadastroPF.setTipoDePessoa("Pessoa Física");
			System.out.println("\nQual o seu CPF?");
			CadastroPF.setCpf();
			CadastroPF.validarCpf();
			
			System.out.println("\nDigite a sua data de nascimento: ");
			CadastroPF.setNascimento("data");
			
			System.out.println("\nNos informe com qual gênero você se identifica?\n1 - Feminino\n2 - Masculino\n 3 - Não binário");
			int escolha = leia.nextInt();
			
			switch(escolha) {
			case 1:
				CadastroPF.setGenero("Feminino");
			break;
			case 2:
				CadastroPF.setGenero("Masculino");
			break;
			case 3:
				CadastroPF.setGenero("Não binário");
			break;
			}
			
			System.out.println("Você é professor ou aluno?\nPor favor, digite 1 para Aluno ou 2 para Professor.");
			int profOuAluno = leia.nextInt();
			
			switch(profOuAluno) {
			case 1:
				curso.setAluno();
				curso.escolherCurso();
			break;
			case 2:
				curso.setProfessora();
				curso.escolherCurso();
			break;
			}
		break;
		case 2: 
			CadastroPF.setTipoDePessoa("Pessoa Juridica");
			System.out.println("");
		break;
		}	
			
	}
 // falta fazer a pessoa juridica tbm
}
