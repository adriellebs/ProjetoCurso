package Projeto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int opcaoCadastrar;
		Scanner leia = new Scanner(System.in);//Criando nosso leitor
		
		//Mensagem de boas vindas
		System.out.println("\n\t\t----------- Seja bem-vindo(a) a Digital House Brasil! ----------- "
				+ "\n\t\t--------- Por favor, nos informe o se você é PF ou PJ para iniciar. ------- ");
		
		
		do{
			//PF OU PJ??????-----------------------------------------------------------------
			System.out.println("1-PF\n2-PJ");
			int opcao = leia.nextInt();//Lendo se é PF ou PJ
			//Validando PF Ou PJ
			while(opcao < 1 || opcao > 2) {
				System.out.println("Opção Inválida, digite 1 para PF ou 2 para PJ");
				leia.nextLine();//Limpando Scanner
				opcao  = leia.nextInt();
				
			};
			
			//Se chegou aqui é pq a opção 1 ou 2 está validada
			
			if(opcao == 1 ) {
				
				CadastroPF pessoaFisica = new CadastroPF();
				
				//Nome-----------------------------------------------------------------
				System.out.println("Informe o seu nome abaixo: ");
				leia.nextLine();//Limpando Scanner
				String nome = leia.nextLine(); //Lendo o nome
				pessoaFisica.setNome(nome);//Atribuindo o nome
				
				
				//Endereco-----------------------------------------------------------------
				System.out.println("\nQual o seu endereço?");
				
				String endereco = leia.nextLine(); // Lendo o endereço
				pessoaFisica.setEndereco(endereco);//Atribuindo o endereco
				
				//Telefone-----------------------------------------------------------------
				System.out.println("\nInforma pra a gente o seu telefone com ddd: ");
				
				String telefone = leia.nextLine(); // Lendo o telefone
				pessoaFisica.setTelefone(telefone); //Atribuindo o telefone
				
				//EMAIL-----------------------------------------------------------------
				System.out.println("\nInforma também um endereço de email, por favor? ");
				
				String email = leia.nextLine(); // Lendo o email
				pessoaFisica.setEmail(email); //Atribuindo o email
				
				//CPF-----------------------------------------------------------------
				System.out.println("\nDigite o seu CPF, por favor? ");
				
				String cpf = leia.nextLine(); // Lendo o CPF
				pessoaFisica.setCpf(cpf); //Atribuindo o CPF
				pessoaFisica.validarCpf(); //Validando CPF
				
				//Data de Nascimento-----------------------------------------------------------------
				System.out.println("\nDigite a sua data de nascimento, por favor? ");
				
				String dataNascimento = leia.nextLine(); // Lendo a Data de Nascimento
				pessoaFisica.setNascimento(dataNascimento);//Atribuindo a data de nascimento 
				
				//Genero-----------------------------------------------------------------
				System.out.println("\nDigite o seu genero, por favor? ");
				System.out.println("1- Feminino 2 - Masculino 3 - Outros");
				
				int opcaoGenero = leia.nextInt(); //Lendo a opção para o genero
				while(opcaoGenero < 1 || opcaoGenero > 3 ) {
					System.out.println("Opcao inválida, digite 1 para Feminino 2 para Masculino ou 3 para Outros");
					leia.nextLine();//Limpando Scanner
					opcaoGenero = leia.nextInt(); //Pedindo para a pessoa digitar novamente
				}
				leia.nextLine();//Limpando Scanner, só limpa ele depois de um nextInt
				
				//Apos Validar a opção
				if(opcaoGenero == 1) {
					pessoaFisica.setGenero("Feminino");
				}else if (opcaoGenero ==2) {
					pessoaFisica.setGenero("Masculino");
				}else {
					pessoaFisica.setGenero("Outros");
				}
				
				//Conferindo se armazenamos tudo na pessoaFisica
				//System.out.println(pessoaFisica);
				
			}else {
				
				//PJ AQUI /////////////////////////////////////////////////////
				
				
			}
			
			System.out.println("Deseja cadastrar uma nova pessoa?");
			System.out.println("1 - Sim\n 2 - Não");
			opcaoCadastrar = leia.nextInt();
			while(opcaoCadastrar < 0 || opcaoCadastrar > 2) {
				System.out.println("Opção Inválida, digite 1 para sim ou 2 para não");
				leia.nextLine();
				opcaoCadastrar = leia.nextInt();
			}
			leia.nextLine();
		} while(opcaoCadastrar != 2);
		
			
	}

}
