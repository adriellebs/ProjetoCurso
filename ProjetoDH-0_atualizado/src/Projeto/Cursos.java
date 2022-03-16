package Projeto;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Cursos {

	Scanner leia = new Scanner(System.in);
	private String segmento;
	private List<CadastroPJ> empresasParceiras = new ArrayList<CadastroPJ>();	
	private String curso;
	private List<CadastroPF> alunos = new ArrayList<CadastroPF>();
	
	private String menu = "Os segmentos e cursos disponiveis são:"
			+ "\nTecnologia: "
			+ "\n\tDesign"
			+ "\n\tData Science"
			+ "\n\tDesenvolvimento Web"
			+ "\n\nMarketing:"
			+ "\n\tNeuromarketing"
			+ "\n\tMarketing Digital"
			+ "\n\nContabilidade e Finanças:"
			+ "\n\tMatemática Financeira"
			+ "\n\tControladoria"
			+ "\n\tAnálise de Balanços";
	
	
	public Cursos() 
	{
		
	}
	
	public Cursos(String nomeCurso, String segmento) 
	{
		this.curso = nomeCurso;
		this.segmento = segmento;
	}

	public String getSegmento() 
	{
		return segmento;
	}

	public void setSegmento(String segmento)
	{
		this.segmento = segmento;
	}


	public String getCurso() 
	{
		return curso;
	}

	public void setCurso(String curso) 
	{
		this.curso = curso;
	}
	
	
	public String getMenu() 
	{
		return menu;
	}

	public void setMenu(String menu) 
	{
		this.menu = menu;
	}


	public void escolherCurso() 
	{
		
		System.out.println(this.menu);
		
		try {
			
			System.out.println("\nDigite o número do segmento de sua escolha: "
					+ "\n1 - Tecnologia"
					+ "\n2 - Marketing"
					+ "\n3 - Contabilidade e Finanças");
			int segmento = leia.nextInt();
			
			while (segmento < 1 || segmento > 3) {
				leia.nextLine();
				System.out.println("\nOpção inválida. Escolha o seu curso: "
						+ "\n1 - Tecnologia"
						+ "\n2 - Marketing"
						+ "\n3 - Contabilidade e Finanças");
				segmento = leia.nextInt();
				
			}
			
			switch(segmento) {
			case 1:
				setSegmento("Tecnologia");
				System.out.println("\nEscolha o seu curso: "
						+ "\n1 - Design"
						+ "\n2 - Data Science"
						+ "\n3 - Desenvolvimento Web");
				int escolha = leia.nextInt();
			
				while (escolha < 1 || escolha > 3) {
					leia.nextLine();
					System.out.println("\nOpção inválida. Escolha o seu curso: "
							+ "\n1 - Design "
							+ "\n2 - Data Science "
							+ "\n3 - Desenvolvimento Web");
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
				System.out.println("\nEscolha o seu curso: "
						+ "\n1 - Neuromarketing"
						+ "\n2 - Marketing Digital");
				int escolher = leia.nextInt();
				
				while (escolher < 1 || escolher > 2) {
					leia.nextLine();
					System.out.println("\nOpção inválida. Escolha o seu curso: "
							+ "\n1 - Neuromarketing "
							+ "\n2 - Marketing Digital");
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
				System.out.println("\nEscolha o seu curso: "
						+ "\n1 - Matemática Financeira"
						+ "\n2 - Controladoria\n3 - Análise de balanços");
				int escolh = leia.nextInt();
				
				while (escolh < 1 || escolh > 3) {
					leia.nextLine();
					System.out.println("\nOpção inválida. Escolha o seu curso: "
							+ "\n1 - Matemática Financeira "
							+ "\n2 - Controladoria "
							+ "\n3 - Análise de balanços");
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
			
		} catch (InputMismatchException e) 
		{
			System.out.println("Tipo de dado invalido, digite o número correspondente ao curso escolhido.");
			
		}
		
	//	
		System.out.println("\n\nCadastro realizado para o curso " + getCurso() +", do segmento " + getSegmento()+".");
		
	}
	
	public void addEmpresaParceira(CadastroPJ empresa) {
		this.empresasParceiras.add(empresa);
	}
	
	public List<CadastroPF> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<CadastroPF> alunos) {
		this.alunos = alunos;
	}

	public List<CadastroPJ> getEmpresasParceiras() {
		return empresasParceiras;
	}

	public void matricularAluno(CadastroPF aluno) 
	{
		this.alunos.add(aluno);
	}

	@Override
	public String toString() {
		return "Cursos [segmento=" + segmento + ", empresasParceiras=" + empresasParceiras + ", curso=" + curso
				+ ", alunos=" + alunos ;
	}
	
	
	
	
}
