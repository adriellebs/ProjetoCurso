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
		Cursos cursoMatematicaFinanceira = new Cursos("Matemática","Contabilidade e Finanças");
		Cursos cursoControladoria = new Cursos("Controladoria","Contabilidade e Finanças");
		Cursos cursoAnalisedeBalanco = new Cursos("Análise de Balanço","Contabilidade e Finanças");
		
	
		
		
		//Mensagem de boas vindas
		System.out.println("\n\t\t----------- Seja bem-vindo(a) a Digital House Brasil! ----------- ");
	
		
		////////////////////////////////MENU PRINCIPAL////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("1-Criar novo cadastros");
		System.out.println("2-Visualizar cadastros");
		System.out.println("3-Sair");
		int opcaoMenu = leia.nextInt();//Lendo opçoes
		leia.nextLine(); //Limpando Scanner/Buffer
		
		//////////VALIDANDO OPÇÕES MENU PRINCIPAL/////////////////////////////////////////////////////////
		while(opcaoMenu < 1 || opcaoMenu > 3) {
			System.out.println("--------Opção inválida-------------");
			System.out.println("1-Criar novo cadastros");
			System.out.println("2-Visualizar cadastros");
			System.out.println("3-Sair");
			opcaoMenu = leia.nextInt();//Lendo opçoes
			leia.nextLine();
		}
		
		if(opcaoMenu == 1 ) {
			
			int opcaoCadastrar;//VARIAVEL PARA LÁ NO FINAL PERGUNTAR SE VC QUER CADASTRAR UMA PESSOA NOVA OU NÃO
			
			do{
				
				//PF OU PJ??????-----------------------------------------------------------------
				
				System.out.println("1-PF\n2-PJ");
				int opcaoPFPJ = leia.nextInt();//Lendo se é PF ou PJ
				//Validando PF Ou PJ
				while(opcaoPFPJ < 1 || opcaoPFPJ > 2) {
					System.out.println("Opção Inválida, digite 1 para PF ou 2 para PJ");
					leia.nextLine();//Limpando Scanner
					opcaoPFPJ  = leia.nextInt();
					
				};
				
				//Se chegou aqui é pq a opção 1 ou 2 está validada
				
				if(opcaoPFPJ == 1 ) {
					
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
					}else if(cursoEscolhido.getCurso() == "Matemática Financeira") {
						cursoEscolhido = cursoMatematicaFinanceira;
					}else if(cursoEscolhido.getCurso() == "Controladoria") {
						cursoEscolhido = cursoControladoria;
					}else {
						cursoEscolhido = cursoAnalisedeBalanco;
					}
					
					System.out.println("CADASTRADO COM SUCESSO");
					cursoEscolhido.exibirInformacoesCurso();
					
				
				}else {
					//Criação do PJ
					CadastroPJ pessoaJuridica = new CadastroPJ();
					
					
					System.out.println("Informe o sua razão social abaixo: ");
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
				System.out.println("1 - Sim\n 2 - Não");
				
				opcaoCadastrar = leia.nextInt();
				while(opcaoCadastrar < 0 || opcaoCadastrar > 2) {
					System.out.println("Opção Inválida, digite 1 para sim ou 2 para não");
					leia.nextLine();
					opcaoCadastrar = leia.nextInt();
				}
				leia.nextLine();
			} while(opcaoCadastrar != 2);
			
			////////////////////////VOLTANDO PRO MENU////////////////////////////////////////////////////////////
			String arg [] = {};
			main.main(arg);
			
			
		}else if (opcaoMenu == 2) {
			System.out.println("Opção 2");
			
			////////////////////////VOLTANDO PRO MENU////////////////////////////////////////////////////////////
			String arg [] = {};
			main.main(arg);
			
		}else {
			System.out.println("Tchaaaau muito obrigado....");
		}
		
		
		

		
		
	}

	
	
}
