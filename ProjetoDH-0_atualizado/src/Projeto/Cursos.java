package Projeto;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Cursos {
	//private CadastroPF professora;
	Scanner leia = new Scanner(System.in);
	private String segmento;
	//private CadastroPJ empresaParceira;	
	private String curso;
	private List<CadastroPF> alunos = new ArrayList<CadastroPF>();
	
	private String menu = "Os segmentos e cursos disponiveis são:\n\n"
			+ "Tecnologia: \n\tDesign"
			+ "\n\tData Science\n"
			+ "\tDesenvolvimento Web\n\n"
			+ "Marketing:"
			+ "\n\tNeuromarketing\n"
			+ "\tMarketing Digital"
			+ "\n\nContabilidade e Finanças:\n"
			+ "\tMatemática Financeira\n"
			+ "\tControladoria\n"
			+ "\tAnálise de Balanços";
	
	
	public Cursos() {
		
	}
	
	public Cursos(String nomeCurso, String segmento) {
		this.curso = nomeCurso;
		this.segmento = segmento;
	}

	/*
	public CadastroPJ getEmpresaParceira() {
		return empresaParceira;
	}

	public void setEmpresaParceira(CadastroPJ empresaParceira) {
		this.empresaParceira = empresaParceira;
	}
	 */
	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}


	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}


	public void escolherCurso() {
		
		System.out.println(this.menu);
		
		try {
			
			System.out.println("\nDigite o número do segmento de sua escolha: \n1 - Tecnologia\n2 - Marketing\n3 - Contabilidade e Finanças");
			int segmento = leia.nextInt();
			
			while (segmento < 1 || segmento > 4) {
				leia.nextLine();
				System.out.println("\nOpção inválida, Escolha o seu curso: \n1 - Tecnologia\n2 - Marketing\n3 - Contabilidade e Finanças");
				segmento = leia.nextInt();
				
			}
			
			switch(segmento) {
			case 1:
				setSegmento("Tecnologia");
				System.out.println("\nEscolha o seu curso: \n1 - Design\n2 - Data Science\n3 - Desenvolvimento Web");
				int escolha = leia.nextInt();
			
				while (escolha < 1 || escolha > 4) {
					leia.nextLine();
					System.out.println("\nOpção inválida, Escolha o seu curso: \n1 - Design \n2 - Data Science \n3 - Desenvolvimento Web");
					escolha = leia.nextInt();
						
				}
				switch(escolha) {
				case 1: 
					setCurso("Design");
				break;
				case 2:
					setCurso("Data Sciece");
				break;
				case 3:
					setCurso("Desenvolvimento Web");
				break;
				}
			break;
			case 2:
				setSegmento("Marketing");
				System.out.println("\nEscolha o seu curso: \n1 - Neuromarketing\n2 - Marketing Digital");
				int escolher = leia.nextInt();
				
				while (escolher < 1 || escolher > 4) {
					leia.nextLine();
					System.out.println("\nOpção inválida, Escolha o seu curso: \n1 - Neuromarketing \n2 - Marketing Digital");
					escolher = leia.nextInt();
						
				}
				switch(escolher) {
				case 1: 
					setCurso("Neuromarketing");
				break;
				case 2:
					setCurso("Marketing Digital");
				break;
				}
			break;
			case 3:
				setSegmento("Contabilidade e Finanças");
				System.out.println("\nEscolha o seu curso: \n1 - Matemática Financeira\n2 - Controladoria\n3 - Análise de balanços");
				int escolh = leia.nextInt();
				
				while (escolh < 1 || escolh > 4) {
					leia.nextLine();
					System.out.println("\nOpção inválida, Escolha o seu curso: \n1 - Matemática Financeira \n2 - Controladoria \n3 - Análise de balanços");
					escolh = leia.nextInt();
						
				}
				
				switch(escolh) {
				case 1:
					setCurso("Matemática Financeira");
				break;
				case 2:
					setCurso("Controladoria");
				break;
				case 3:
					setCurso("Análise de balanços");
				break;
				}
			break;
							
			
		}
			
		} catch (InputMismatchException e) {
			System.out.println("Tipo de dado invalido, digite uma opção valida");
			
		}
		
	//	
		System.out.println("\n\nVocê escolheu o curso: " + getCurso() +", do segmento: " + getSegmento());
		
	}
	
	public void exibirInformacoesCurso() {
		System.out.println("Nome do Curso: "+this.curso);
		System.out.println("Segmento do Curso: "+this.segmento);
		//System.out.println("Professor do Curso: "+this.professora.getNome());
		//System.out.println("Empresa Parceira: "+ this.empresaParceira);
		System.out.println("--------------------------------------------");
		
	}
}
