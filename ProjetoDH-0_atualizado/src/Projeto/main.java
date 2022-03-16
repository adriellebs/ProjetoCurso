package Projeto;

import java.util.Scanner;

public class main {
	/////INSTANCIANDO/CRIANDO OBJETOS ////////////////////////////////////////////////////////////////////////
	
	//Cadastrando os Cursos
	static Cursos cursoEscolhido = new Cursos();
	static Cursos cursoDesign = new Cursos("Design","Tecnologia");
	static Cursos cursoDataScience = new Cursos("Data Science","Tecnologia");
	static Cursos cursoDesenvolvimento = new Cursos("Desenvolvimento","Tecnologia");
	static Cursos cursoNeuromarketing = new Cursos("Neuromarketing","Marketing");
	static Cursos cursoMarketingDigital = new Cursos("Marketing Digital","Marketing");
	static Cursos cursoMatematicaFinanceira = new Cursos("Matemática","Contabilidade e Finanças");
	static Cursos cursoControladoria = new Cursos("Controladoria","Contabilidade e Finanças");
	static Cursos cursoAnaliseBalanco = new Cursos("Análise de Balanço","Contabilidade e Finanças");
	
	public static void main(String[] args)
	{
		
		
		Scanner leia = new Scanner(System.in);
		
		//Mensagem de boas vindas
		System.out.println("\n\t\t----------- Seja bem-vindo(a) a Digital House Brasil! ----------- ");
	
		
		////////////////////////////////MENU PRINCIPAL////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("1-Criar novo cadastro");
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
		
		if(opcaoMenu == 1 ) 
		{
			//////////////CADASTRO PF OU PJ////////////////////////////////////////////////////////////////
			
			
			int opcaoCadastrar;//VARIAVEL PARA LÁ NO FINAL PERGUNTAR SE VC QUER CADASTRAR UMA PESSOA NOVA OU NÃO
			do
			{
				
				//PF OU PJ-----------------------------------------------------------------
				
				System.out.println("\nDigite a opção correspondente:"
						+ "\n1-Pessoa Física"
						+ "\n2-Pessoa Jurídica");
				int opcaoPFPJ = leia.nextInt();//Lendo se é PF ou PJ
				
				//Validando PF Ou PJ
				while(opcaoPFPJ < 1 || opcaoPFPJ > 2) 
				{
					System.out.println("Opção Inválida!"
							+ "\nDigite a opção correspondente:"
							+ "\n1-Pessoa Física"
							+ "\n2-Pessoa Jurídica");
					leia.nextLine();//Limpando Scanner
					opcaoPFPJ  = leia.nextInt();
					
				};
				
				//Se chegou aqui é pq a opção 1 ou 2 está validada
				
				if(opcaoPFPJ == 1 ) 
				{
					
					CadastroPF pessoaFisica = new CadastroPF();
					
					//Nome-----------------------------------------------------------------
					System.out.println("Informe o seu nome: ");
					leia.nextLine();//Limpando Scanner
					String nome = leia.nextLine(); //Lendo o nome
					pessoaFisica.setNome(nome);//Atribuindo o nome
					
					
					//Endereco-----------------------------------------------------------------
					System.out.printf("\nOlá, %s! Informe por gentileza os seus dados: ",nome);
					System.out.println("\nEndereço: ");		
					String endereco = leia.nextLine(); // Lendo o endereço
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
					System.out.println("\nCPF (sem ponto e traço): ");
					String cpf = leia.nextLine(); // Lendo o CPF
					pessoaFisica.setCpf(cpf); //Atribuindo o CPF
					pessoaFisica.validarCpf(); //Validando CPF
					
					//Data de Nascimento-----------------------------------------------------------------
					System.out.println("\nSua data de nascimento: ");					
					String dataNascimento = leia.nextLine(); // Lendo a Data de Nascimento
					pessoaFisica.setNascimento(dataNascimento);//Atribuindo a data de nascimento 
					
					//Genero-----------------------------------------------------------------
					System.out.println("\nDigite a opção correspondente ao seu gênero, por favor: ");
					System.out.println("\n1- Feminino "
									 + "\n2 - Masculino "
									 + "\n3 - Outros");
					
					int opcaoGenero = leia.nextInt(); //Lendo a opção para o genero
					while(opcaoGenero < 1 || opcaoGenero > 3 ) 
					{
						System.out.println("Opcao inválida! Digite a opção correspondente"
								+ " ao seu gênero, por favor:"
								+ "\n1- Feminino "
								+ "\n2 - Masculino"
								+ "\n3 - Outros");
						leia.nextLine();//Limpando Scanner
						opcaoGenero = leia.nextInt(); //Pedindo para a pessoa digitar novamente
					}
					leia.nextLine();//Limpando Scanner, só limpa ele depois de um nextInt
					
					//Apos Validar a opção
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
					else if(cursoEscolhido.getCurso() == "Matemática Financeira") 
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
					cursoEscolhido.matricularAluno(pessoaFisica); //para vincular o cadastro realizado à lista de alunos matriculados
					
				
					}
					else
					{
					//Criação do PJ
					CadastroPJ pessoaJuridica = new CadastroPJ();
					
					
					System.out.println("Informe o nome da empresa: ");
					leia.nextLine();
					String nome = leia.nextLine(); 
					pessoaJuridica.setNome(nome);
					
					System.out.println("Olá,"+nome+ "! Informe por gentileza:"
							+ "\nCNPJ (sem ponto e traço): ");
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
						cursoEscolhido.addEmpresaParceira(pessoaJuridica);
						
					}
					else if (cursoEscolhido.getCurso() == "Data Science") 
					{
						cursoEscolhido.addEmpresaParceira(pessoaJuridica);
						
					}
					else if(cursoEscolhido.getCurso() == "Desenvolvimento Web") 
					{
						cursoEscolhido.addEmpresaParceira(pessoaJuridica);
						
					}
					else if(cursoEscolhido.getCurso() == "Neuromarketing") 
					{
						cursoEscolhido.addEmpresaParceira(pessoaJuridica);
						
					}
					else if(cursoEscolhido.getCurso() == "Marketing Digital") 
					{
						cursoEscolhido.addEmpresaParceira(pessoaJuridica);
						
					}
					else if(cursoEscolhido.getCurso() == "Matemática Financeira") 
					{
						cursoEscolhido.addEmpresaParceira(pessoaJuridica);
						
					}
					else if(cursoEscolhido.getCurso() == "Controladoria") 
					{
						cursoEscolhido.addEmpresaParceira(pessoaJuridica);
						
					}
					else 
					{
						cursoEscolhido.addEmpresaParceira(pessoaJuridica);
					}			
					
				}
					
						
				System.out.println("---------CADASTRADO COM SUCESSO--------------");
				//Deseja Cadastrar uma nova pessoa????
				System.out.println("\n---------------------------------------------------------");
				System.out.println("Deseja realizar um novo cadastro?");
				System.out.println("1 - Sim"
							  + "\n2 - Não");
				
				opcaoCadastrar = leia.nextInt();
				while(opcaoCadastrar < 1 || opcaoCadastrar > 2) 
				{
					System.out.println("Opção Inválida, digite a opção correspondente a sua escolha. "
							+ "Deseja realizar um novo cadastro?"
							+ "\n1 - Sim"
							+ "\n2 - Não");
					leia.nextLine();
					opcaoCadastrar = leia.nextInt();
				}
				leia.nextLine();
			} while(opcaoCadastrar != 2);
			
			////////////////////////VOLTANDO PRO MENU////////////////////////////////////////////////////////////
			String arg [] = {};
			main.main(arg);
			
			
		}
		else if (opcaoMenu == 2) 
		{
			//////////////VISUALIZAÇÃO////////////////////////////////////////////////////////////////
			
			System.out.println("1-Visualizar Alunos");
			System.out.println("2-Visualizar Empresas");
			
			
			
			////////////////////////VOLTANDO PRO MENU////////////////////////////////////////////////////////////
			String arg [] = {};
			main.main(arg);
			
		}
		else 
		{
			System.out.println("Obrigado por utilizar nosso sistema!");
		}
		
		
		

		
		
	}

	
	
}
