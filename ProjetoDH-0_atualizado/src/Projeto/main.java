package Projeto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int opcaoCadastrar;
		Scanner leia = new Scanner(System.in);//Criando nosso leitor
		Cursos cursoEscolhido = new Cursos();
		Cursos cursoDesign = new Cursos("Design","Tecnologia");
		Cursos cursoDataScience = new Cursos("Data Science","Tecnologia");
		Cursos cursoDesenvolvimento = new Cursos("Desenvolvimento","Tecnologia");
		Cursos cursoNeuromarketing = new Cursos("Neuromarketing","Marketing");
		Cursos cursoMarketingDigital = new Cursos("Marketing Digital","Marketing");
		Cursos cursoMatematicaFinanceira = new Cursos("Matemática","Contabilidade e Finanças");
		Cursos cursoControladoria = new Cursos("Controladoria","Contabilidade e Finanças");
		Cursos cursoAnalisedeBalanco = new Cursos("Análise de Balanço","Contabilidade e Finanças");
		
	
		//Cursos curso = new Cursos();
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
				
				
				//Escolher o curso
				cursoEscolhido.escolherCurso();
				
				if(cursoEscolhido.getCurso() == "Design") {
					
				}else if (cursoEscolhido.getCurso() == "Data Science") {
					cursoEscolhido = cursoDataScience;
				}else if(cursoEscolhido.getCurso() == "Desenvolvimento Web") {
					cursoEscolhido = cursoDataScience;
				}else if(cursoEscolhido.getCurso() == "Neuromarketing") {
					cursoEscolhido = cursoDataScience;
				}else if(cursoEscolhido.getCurso() == "Marketing Digital") {
					cursoEscolhido = cursoDataScience;
				}else if(cursoEscolhido.getCurso() == "Matemática Financeira") {
					cursoEscolhido = cursoDataScience;
				}else if(cursoEscolhido.getCurso() == "Controladoria") {
					cursoEscolhido = cursoDataScience;
				}else {
					cursoEscolhido = cursoControladoria;
				}
				
				//Professor ou Aluno-----------------------------------------------------------------
				System.out.println("\nVocê é professor ou aluno????");
				System.out.println("1 - Aluno 2 - Professor");
				int professorOuAluno = leia.nextInt();
				
				while(professorOuAluno < 1  || professorOuAluno> 2) {
					System.out.println("Opção Inválida, 1- Para Aluno, 2- para Professor");
					leia.nextLine(); // Limpando o Scanner
					professorOuAluno = leia.nextInt(); //Lendo novamento Professor ou Aluno
				}
				
				//Validando
				if(professorOuAluno == 2) {
					cursoEscolhido.setProfessora(pessoaFisica);
					
				}else {
					System.out.println("Aluno");
				}
				
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
		
			
	}

}
