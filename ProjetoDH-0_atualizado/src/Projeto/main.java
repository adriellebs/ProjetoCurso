package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	/////INSTANCIANDO/CRIANDO OBJETOS EST�TICOS DE CLASSE ////////////////////////////////////////////////////////////////////////
	
	//Cadastrando os Cursos de forma EST�TICA
	static Cursos cursoEscolhido = new Cursos();
	static Cursos cursoDesign = new Cursos("Design","Tecnologia");
	static Cursos cursoDataScience = new Cursos("Data Science","Tecnologia");
	static Cursos cursoDesenvolvimento = new Cursos("Desenvolvimento","Tecnologia");
	static Cursos cursoNeuromarketing = new Cursos("Neuromarketing","Marketing");
	static Cursos cursoMarketingDigital = new Cursos("Marketing Digital","Marketing");
	static Cursos cursoMatematicaFinanceira = new Cursos("Matem�tica","Contabilidade e Finan�as");
	static Cursos cursoControladoria = new Cursos("Controladoria","Contabilidade e Finan�as");
	static Cursos cursoAnaliseBalanco = new Cursos("An�lise de Balan�o","Contabilidade e Finan�as");
	static Cursos[] todosCursos = {cursoDesign,cursoDataScience,cursoDesenvolvimento,
			cursoNeuromarketing,cursoMarketingDigital,cursoMatematicaFinanceira,cursoControladoria,cursoAnaliseBalanco};
	static int contadorMenuPrincipal = 0;
	
	//Bloco de inicializa��o da classe
	static{
		//PJ/////////////////////////////////////////////////////////////////////////////////////
		CadastroPJ portoSeguro = new CadastroPJ("Porto Seguro", "11111111111111", "Seguros");
		CadastroPJ cocaCola = new CadastroPJ("Coca-Cola", "11111111111111", "Bebidas");
		CadastroPJ nVidia = new CadastroPJ("NVidia", "11111111111111", "Placas de V�deo");
		CadastroPJ contaAzul = new CadastroPJ("Conta Azul", "11111111111111", "Gest�o Financeira");
		CadastroPJ meuPet = new CadastroPJ("Meu Pet", "11111111111111", "Petshop");
		CadastroPJ mercedes = new CadastroPJ("Mercedes", "11111111111111", "Autom�veis");
		CadastroPJ bancoInter = new CadastroPJ("Banco Inter", "11111111111111", "Banco");
		//PF///////////////////////////////////////////////////////////////////////////////////////
		CadastroPF aluno1 = new CadastroPF("Brenner");
		CadastroPF aluno2 = new CadastroPF("Bela");
		CadastroPF aluno3 = new CadastroPF("Bonner");
		CadastroPF aluno4 = new CadastroPF("Carla");
		CadastroPF aluno5 = new CadastroPF("Joaquina");
		CadastroPF aluno6 = new CadastroPF("Julio");
		CadastroPF aluno7 = new CadastroPF("Fabiana");
		CadastroPF aluno8 = new CadastroPF("Ana");
		CadastroPF aluno9 = new CadastroPF("Jukes");
		CadastroPF aluno10 = new CadastroPF("Bartolomeu");
		CadastroPF aluno11 = new CadastroPF("Yago");
		
		
		//ADCIONANDO AS EMPRESAS NOS CURSOS
		cursoDesign.addEmpresaParceira(portoSeguro);
		cursoDesign.addEmpresaParceira(cocaCola);
		cursoDataScience.addEmpresaParceira(portoSeguro);
		cursoDesenvolvimento.addEmpresaParceira(portoSeguro);
		cursoMatematicaFinanceira.addEmpresaParceira(contaAzul);
		cursoAnaliseBalanco.addEmpresaParceira(nVidia);
		cursoNeuromarketing.addEmpresaParceira(bancoInter);
		cursoMarketingDigital.addEmpresaParceira(mercedes);
		cursoAnaliseBalanco.addEmpresaParceira(meuPet);
		
		
		//ADCIONANDO OS ALUNOS NOS CURSOS
		cursoDesign.matricularAluno(aluno1);
		cursoDesign.matricularAluno(aluno2);
		cursoDataScience.matricularAluno(aluno3);
		cursoDataScience.matricularAluno(aluno4);
		cursoDesenvolvimento.matricularAluno(aluno5);
		cursoDesenvolvimento.matricularAluno(aluno6);
		cursoMatematicaFinanceira.matricularAluno(aluno7);
		cursoMarketingDigital.matricularAluno(aluno8);
		cursoAnaliseBalanco.matricularAluno(aluno9);
		cursoNeuromarketing.matricularAluno(aluno10);
		
		
	}
	
	public static void main(String[] args)
	{
		
		
		Scanner leia = new Scanner(System.in);
		
		//Mensagem de boas vindas
		if(contadorMenuPrincipal==0) {
			
			System.out.println("\n\t\t----------- Seja bem-vindo(a) a Digital House Brasil! ----------- ");
		}
	
		
		////////////////////////////////MENU PRINCIPAL////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("1-Criar novo cadastro");
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
		
		if(opcaoMenu == 1 ) 
		{
			//////////////CADASTRO PF OU PJ////////////////////////////////////////////////////////////////
			
			
			int opcaoCadastrar;//VARIAVEL PARA L� NO FINAL PERGUNTAR SE VC QUER CADASTRAR UMA PESSOA NOVA OU N�O
			do
			{
				
				//PF OU PJ-----------------------------------------------------------------
				
				System.out.println("\nDigite a op��o correspondente:"
						+ "\n1-Pessoa F�sica"
						+ "\n2-Pessoa Jur�dica");
				int opcaoPFPJ = leia.nextInt();//Lendo se � PF ou PJ
				
				//Validando PF Ou PJ
				while(opcaoPFPJ < 1 || opcaoPFPJ > 2) 
				{
					System.out.println("Op��o Inv�lida!"
							+ "\nDigite a op��o correspondente:"
							+ "\n1-Pessoa F�sica"
							+ "\n2-Pessoa Jur�dica");
					leia.nextLine();//Limpando Scanner
					opcaoPFPJ  = leia.nextInt();
					
				};
				
				//Se chegou aqui � pq a op��o 1 ou 2 est� validada
				
				if(opcaoPFPJ == 1 ) 
				{
					
					CadastroPF pessoaFisica = new CadastroPF();
					
					//Nome-----------------------------------------------------------------
					System.out.println("Informe o seu nome: ");
					leia.nextLine();//Limpando Scanner
					String nome = leia.nextLine(); //Lendo o nome
					pessoaFisica.setNome(nome);//Atribuindo o nome
					
					
					//Endereco-----------------------------------------------------------------
					System.out.printf("\nOl�, %s! Informe por gentileza os seus dados: ",nome);
					System.out.println("\nEndere�o: ");		
					String endereco = leia.nextLine(); // Lendo o endere�o
					pessoaFisica.setEndereco(endereco);//Atribuindo o endereco
					
					//Telefone-----------------------------------------------------------------
					System.out.println("\nTelefone para contato com DDD: ");
					String telefone = leia.nextLine(); // Lendo o telefone
					pessoaFisica.setTelefone(telefone); //Atribuindo o telefone
					
					//E-MAIL-----------------------------------------------------------------
					System.out.println("\nSeu melhor e-mail: ");
					String email = leia.nextLine(); // Lendo o email
					pessoaFisica.setEmail(email); //Atribuindo o email
					
					//CPF-----------------------------------------------------------------
					System.out.println("\nCPF (sem ponto e tra�o): ");
					String cpf = leia.nextLine(); // Lendo o CPF
					pessoaFisica.setCpf(cpf); //Atribuindo o CPF
					pessoaFisica.validarCpf(); //Validando CPF
					
					//Data de Nascimento-----------------------------------------------------------------
					System.out.println("\nSua data de nascimento: ");					
					String dataNascimento = leia.nextLine(); // Lendo a Data de Nascimento
					pessoaFisica.setNascimento(dataNascimento);//Atribuindo a data de nascimento 
					
					//Genero-----------------------------------------------------------------
					System.out.println("\nDigite a op��o correspondente ao seu g�nero, por favor: ");
					System.out.println("\n1- Feminino "
									 + "\n2 - Masculino "
									 + "\n3 - Outros");
					
					int opcaoGenero = leia.nextInt(); //Lendo a op��o para o genero
					while(opcaoGenero < 1 || opcaoGenero > 3 ) 
					{
						System.out.println("Opcao inv�lida! Digite a op��o correspondente"
								+ " ao seu g�nero, por favor:"
								+ "\n1- Feminino "
								+ "\n2 - Masculino"
								+ "\n3 - Outros");
						leia.nextLine();//Limpando Scanner
						opcaoGenero = leia.nextInt(); //Pedindo para a pessoa digitar novamente
					}
					leia.nextLine();//Limpando Scanner, s� limpa ele depois de um nextInt
					
					//Apos Validar a op��o
					if(opcaoGenero == 1) 
					{
						pessoaFisica.setGenero("Feminino");
					}
					else if (opcaoGenero ==2) 
					{
						pessoaFisica.setGenero("Masculino");
					}
					else 
					{
						pessoaFisica.setGenero("Outros");
					}
					
					
					//Escolher o curso
					cursoEscolhido.escolherCurso();
					
					if(cursoEscolhido.getCurso() == "Design") 
					{
						cursoEscolhido = cursoDesign;
					}
					else if (cursoEscolhido.getCurso() == "Data Science") 
					{
						cursoEscolhido = cursoDataScience;
					}
					else if(cursoEscolhido.getCurso() == "Desenvolvimento Web") 
					{
						cursoEscolhido = cursoDesenvolvimento;
					}
					else if(cursoEscolhido.getCurso() == "Neuromarketing") 
					{
						cursoEscolhido = cursoNeuromarketing;
					}
					else if(cursoEscolhido.getCurso() == "Marketing Digital") 
					{
						cursoEscolhido = cursoMarketingDigital;
					}
					else if(cursoEscolhido.getCurso() == "Matem�tica Financeira") 
					{
						cursoEscolhido = cursoMatematicaFinanceira;
					}
					else if(cursoEscolhido.getCurso() == "Controladoria") 
					{
						cursoEscolhido = cursoControladoria;
					}
					else 
					{
						cursoEscolhido = cursoAnaliseBalanco;
					}
					cursoEscolhido.matricularAluno(pessoaFisica); //para vincular o cadastro realizado � lista de alunos matriculados
					
				
					}
					else
					{
					//Cria��o do PJ
					CadastroPJ pessoaJuridica = new CadastroPJ();
					
					
					System.out.println("Informe o nome da empresa: ");
					leia.nextLine();
					String nome = leia.nextLine(); 
					pessoaJuridica.setNome(nome);
					
					System.out.println("Ol�,"+nome+ "! Informe por gentileza:"
							+ "\nCNPJ (sem ponto e tra�o): ");
					String cnpj = leia.nextLine();
					pessoaJuridica.setCnpj(cnpj);
					
					System.out.println("Segmento da empresa: ");
					String segmento = leia.nextLine();
					pessoaJuridica.setSegmento(segmento);
					
					//Escolher curso
					System.out.println("Qual curso deseja parceria?");  
					
					cursoEscolhido.escolherCurso();
					
					if(cursoEscolhido.getCurso() == "Design") 
					{
						cursoEscolhido = cursoDesign;
					}
					else if (cursoEscolhido.getCurso() == "Data Science") 
					{
						cursoEscolhido = cursoDataScience;
					}
					else if(cursoEscolhido.getCurso() == "Desenvolvimento Web") 
					{
						cursoEscolhido = cursoDesenvolvimento;
					}
					else if(cursoEscolhido.getCurso() == "Neuromarketing") 
					{
						cursoEscolhido = cursoNeuromarketing;
					}
					else if(cursoEscolhido.getCurso() == "Marketing Digital") 
					{
						cursoEscolhido = cursoMarketingDigital;
					}
					else if(cursoEscolhido.getCurso() == "Matem�tica Financeira") 
					{
						cursoEscolhido = cursoMatematicaFinanceira;
					}
					else if(cursoEscolhido.getCurso() == "Controladoria") 
					{
						cursoEscolhido = cursoControladoria;
					}
					else 
					{
						cursoEscolhido = cursoAnaliseBalanco;
					}	
					cursoEscolhido.addEmpresaParceira(pessoaJuridica);
					
				}
					
						
				System.out.println("---------CADASTRADO COM SUCESSO--------------");
				//Deseja Cadastrar uma nova pessoa????
				System.out.println("\n---------------------------------------------------------");
				System.out.println("Deseja realizar um novo cadastro?");
				System.out.println("1 - Sim"
							  + "\n2 - N�o");
				
				opcaoCadastrar = leia.nextInt();
				while(opcaoCadastrar < 1 || opcaoCadastrar > 2) 
				{
					System.out.println("Op��o Inv�lida, digite a op��o correspondente a sua escolha. "
							+ "Deseja realizar um novo cadastro?"
							+ "\n1 - Sim"
							+ "\n2 - N�o");
					leia.nextLine();
					opcaoCadastrar = leia.nextInt();
				}
				leia.nextLine();
			} while(opcaoCadastrar != 2);
			
			////////////////////////VOLTANDO PRO MENU////////////////////////////////////////////////////////////
			contadorMenuPrincipal++;
			String arg [] = {};
			main.main(arg);
			
		}
		else if (opcaoMenu == 2) 
		{
			int opcaoAlunoEmpresa = 0;
			//////////////VISUALIZA��O////////////////////////////////////////////////////////////////
			do {
				
				System.out.println("1-Visualizar Alunos");
				System.out.println("2-Visualizar Empresas");
				System.out.println("3-Menu Principal");
				opcaoAlunoEmpresa = leia.nextInt();
				leia.nextLine();
				
				while(opcaoAlunoEmpresa < 1 || opcaoAlunoEmpresa> 3) {
					System.out.println("Op��o Inv�lida, digite 1, 2 ou 3");
					System.out.println("1-Visualizar Alunos");
					System.out.println("2-Visualizar Empresas");
					opcaoAlunoEmpresa = leia.nextInt();	
					leia.nextLine();
				}
				
				if(opcaoAlunoEmpresa == 1) {
					//Alunos
					System.out.println("----------------Lista de alunos matriculados------------------");
					for(Cursos curso: todosCursos) {
						for(CadastroPF aluno: curso.getAlunos()) {
							System.out.println(aluno.getNome() +" - "+ curso.getSegmento());
						}
					}
					
					System.out.println("-----------------Fim lista de alunos---------------------------");
				}else {
					//Empresas
					System.out.println("----------------Lista de empresas que desejam parcerias--------");
					for(Cursos curso: todosCursos) {
						for(CadastroPJ empresa : curso.getEmpresasParceiras()) {
							System.out.println(empresa.getNome()+ " - " + curso.getCurso());
						}
						
					}
					System.out.println("----------------Fim lista de empresas----------------------------");
					
				}
			}while(opcaoAlunoEmpresa != 3);
			
			
			////////////////////////VOLTANDO PRO MENU////////////////////////////////////////////////////////////
			contadorMenuPrincipal++;
			String arg [] = {};
			main.main(arg);
		}
		else 
		{
			System.out.println("Obrigado por utilizar nosso sistema!");
		}

		
		
	}

	
	
}
