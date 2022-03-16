package Projeto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		/////INSTANCIANDO/CRIANDO OBJETOS ////////////////////////////////////////////////////////////////////////
		Scanner leia = new Scanner(System.in);
		//Cadastrando os cursos
		Cursos cursoEscolhido = new Cursos();
		Cursos cursoDesign = new Cursos("Design","Tecnologia");
		Cursos cursoDataScience = new Cursos("Data Science","Tecnologia");
		Cursos cursoDesenvolvimento = new Cursos("Desenvolvimento","Tecnologia");
		Cursos cursoNeuromarketing = new Cursos("Neuromarketing","Marketing");
		Cursos cursoMarketingDigital = new Cursos("Marketing Digital","Marketing");
		Cursos cursoMatematicaFinanceira = new Cursos("Matem�tica","Contabilidade e Finan�as");
		Cursos cursoControladoria = new Cursos("Controladoria","Contabilidade e Finan�as");
		Cursos cursoAnalisedeBalanco = new Cursos("An�lise de Balan�o","Contabilidade e Finan�as");
		
	
		
		
		//Mensagem de boas vindas
		System.out.println("\n\t\t----------- Seja bem-vindo(a) a Digital House Brasil! ----------- ");
	
		
		////////////////////////////////MENU PRINCIPAL////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("1-Criar novo cadastros");
		System.out.println("2-Visualizar cadastros");
		System.out.println("3-Sair");
		int opcaoMenu = leia.nextInt();//Lendo op�oes
		leia.nextLine(); //Limpando Scanner/Buffer
		
		//////////VALIDANDO OP��ES MENU PRINCIPAL/////////////////////////////////////////////////////////
		while(opcaoMenu < 1 || opcaoMenu > 3) {
			System.out.println("--------Op��o inv�lida-------------");
			System.out.println("1-Criar novo cadastros");
			System.out.println("2-Visualizar cadastros");
			System.out.println("3-Sair");
			opcaoMenu = leia.nextInt();//Lendo op�oes
			leia.nextLine();
		}
		
		if(opcaoMenu == 1 ) {
			
			int opcaoCadastrar;//VARIAVEL PARA L� NO FINAL PERGUNTAR SE VC QUER CADASTRAR UMA PESSOA NOVA OU N�O
			
			do{
				
				//PF OU PJ??????-----------------------------------------------------------------
				
				System.out.println("1-PF\n2-PJ");
				int opcaoPFPJ = leia.nextInt();//Lendo se � PF ou PJ
				//Validando PF Ou PJ
				while(opcaoPFPJ < 1 || opcaoPFPJ > 2) {
					System.out.println("Op��o Inv�lida, digite 1 para PF ou 2 para PJ");
					leia.nextLine();//Limpando Scanner
					opcaoPFPJ  = leia.nextInt();
					
				};
				
				//Se chegou aqui � pq a op��o 1 ou 2 est� validada
				
				if(opcaoPFPJ == 1 ) {
					
					CadastroPF pessoaFisica = new CadastroPF();
					
					//Nome-----------------------------------------------------------------
					System.out.println("Informe o seu nome abaixo: ");
					leia.nextLine();//Limpando Scanner
					String nome = leia.nextLine(); //Lendo o nome
					pessoaFisica.setNome(nome);//Atribuindo o nome
					
					
					//Endereco-----------------------------------------------------------------
					System.out.println("\nQual o seu endere�o?");
					
					String endereco = leia.nextLine(); // Lendo o endere�o
					pessoaFisica.setEndereco(endereco);//Atribuindo o endereco
					
					//Telefone-----------------------------------------------------------------
					System.out.println("\nInforma pra a gente o seu telefone com ddd: ");
					
					String telefone = leia.nextLine(); // Lendo o telefone
					pessoaFisica.setTelefone(telefone); //Atribuindo o telefone
					
					//EMAIL-----------------------------------------------------------------
					System.out.println("\nInforma tamb�m um endere�o de email, por favor? ");
					
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
					
					int opcaoGenero = leia.nextInt(); //Lendo a op��o para o genero
					while(opcaoGenero < 1 || opcaoGenero > 3 ) {
						System.out.println("Opcao inv�lida, digite 1 para Feminino 2 para Masculino ou 3 para Outros");
						leia.nextLine();//Limpando Scanner
						opcaoGenero = leia.nextInt(); //Pedindo para a pessoa digitar novamente
					}
					leia.nextLine();//Limpando Scanner, s� limpa ele depois de um nextInt
					
					//Apos Validar a op��o
					if(opcaoGenero == 1) {
						pessoaFisica.setGenero("Feminino");
					}else if (opcaoGenero ==2) {
						pessoaFisica.setGenero("Masculino");
					}else {
						pessoaFisica.setGenero("Outros");
					}
					
					
					//Escolher o curso
					cursoEscolhido.escolherCurso();
					
					if(cursoEscolhido.getCurso() == "Design") {
						
					}else if (cursoEscolhido.getCurso() == "Data Science") {
						cursoEscolhido = cursoDataScience;
					}else if(cursoEscolhido.getCurso() == "Desenvolvimento Web") {
						cursoEscolhido = cursoDesenvolvimento;
					}else if(cursoEscolhido.getCurso() == "Neuromarketing") {
						cursoEscolhido = cursoNeuromarketing;
					}else if(cursoEscolhido.getCurso() == "Marketing Digital") {
						cursoEscolhido = cursoMarketingDigital;
					}else if(cursoEscolhido.getCurso() == "Matem�tica Financeira") {
						cursoEscolhido = cursoMatematicaFinanceira;
					}else if(cursoEscolhido.getCurso() == "Controladoria") {
						cursoEscolhido = cursoControladoria;
					}else {
						cursoEscolhido = cursoAnalisedeBalanco;
					}
					
					System.out.println("CADASTRADO COM SUCESSO");
					cursoEscolhido.exibirInformacoesCurso();
					
				
				}else {
					//Cria��o do PJ
					CadastroPJ pessoaJuridica = new CadastroPJ();
					
					
					System.out.println("Informe o sua raz�o social abaixo: ");
					leia.nextLine();
					String nome = leia.nextLine(); 
					pessoaJuridica.setNome(nome);
					
					System.out.println("Informe seu CNPJ: ");
					String cnpj = leia.nextLine();
					pessoaJuridica.setCnpj(cnpj);
					
					System.out.println("Informe seu segmento: ");
					String segmento = leia.nextLine();
					pessoaJuridica.setSegmento(segmento);
					
					System.out.println("Qual segmento de curso deseja parceria: "); 
					
					
					
					
					
				}
				
				//Deseja Cadastrar uma nova pessoa????
				System.out.println("\n---------------------------------------------------------");
				System.out.println("Deseja cadastrar uma nova pessoa?");
				System.out.println("1 - Sim\n 2 - N�o");
				
				opcaoCadastrar = leia.nextInt();
				while(opcaoCadastrar < 0 || opcaoCadastrar > 2) {
					System.out.println("Op��o Inv�lida, digite 1 para sim ou 2 para n�o");
					leia.nextLine();
					opcaoCadastrar = leia.nextInt();
				}
				leia.nextLine();
			} while(opcaoCadastrar != 2);
			
			////////////////////////VOLTANDO PRO MENU////////////////////////////////////////////////////////////
			String arg [] = {};
			main.main(arg);
			
			
		}else if (opcaoMenu == 2) {
			System.out.println("Op��o 2");
			
			////////////////////////VOLTANDO PRO MENU////////////////////////////////////////////////////////////
			String arg [] = {};
			main.main(arg);
			
		}else {
			System.out.println("Tchaaaau muito obrigado....");
		}
		
		
		

		
		
	}

	
	
}
