package Projeto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		Cadastro cad = new Cadastro();
		CadastroPF CadastroPF = new CadastroPF();
		Cursos curso = new Cursos();
		
		
		System.out.println("\n\t\t----------- Seja bem-vindo(a) a Digital House Brasil! ----------- "
				+ "\n\t\t--------- Por favor, nos informe o seu nome para iniciar. ------- ");
		cad.setNome("nome");
		
		System.out.println("\nQual o seu endereço?");
		cad.setEndereco("endereço");
		
		System.out.println("\nInforma pra a gente o seu telefone com ddd: ");
		cad.setTelefone(0);
		
		System.out.println("\nInforma também um endereço de email, por favor? ");
		cad.setEmail("email");
		
		System.out.println("\nVocê é uma pessoa física ou jurídica? Digite PF ou PJ, por favor.");
		String pessoa = leia.nextLine();
		
		if(pessoa == "PF") {
			CadastroPF.setTipoDePessoa("Pessoa Física");
			System.out.println("\nQual o seu CPF?");
			CadastroPF.setCpf(0);
			
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
			
			curso.escolherCurso();
			}
		else if(pessoa == "PJ") {
			CadastroPF.setTipoDePessoa("Pessoa Juridica");
		}
		else {
			System.out.println("Opção inválida.\nPor favor digite PF se for uma Pessoa Física ou PJ se for uma Pessoa Juridica.");
		}
		
		//System.out.println("\nSua matricula foi realizada com sucesso!\n\nBem vinda" + cad.getNome() + ", você mora em " + cad.getEndereco() + ", seu telefone é: "
		//+ cad.getTelefone() + ", e seu email é: "+ cad.getEmail());
		
	}

}
