package Projeto;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Cursos {

	Scanner leia = new Scanner(System.in);
	
	//ATRIBUTOS///////////////////////////////////////////
	private String segmento;
	private List<CadastroPJ> empresasParceiras = new ArrayList<CadastroPJ>();	
	private String curso;
	private List<CadastroPF> alunos = new ArrayList<CadastroPF>();
	private String menu = "Os segmentos e cursos disponiveis s�o:"
			+ "\nTecnologia: "
			+ "\n\tDesign"
			+ "\n\tData Science"
			+ "\n\tDesenvolvimento Web"
			+ "\n\nMarketing:"
			+ "\n\tNeuromarketing"
			+ "\n\tMarketing Digital"
			+ "\n\nContabilidade e Finan�as:"
			+ "\n\tMatem�tica Financeira"
			+ "\n\tControladoria"
			+ "\n\tAn�lise de Balan�os";
	
	//CONSTRUTORES////////////////////////////////////////////////////////////////////////////////
	public Cursos() 
	{
		
	}
	
	public Cursos(String nomeCurso, String segmento) 
	{
		this.curso = nomeCurso;
		this.segmento = segmento;
	}

	//GETTERS AND SETTERS////////////////////////////////////////////////////////////////////////////////
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

	//OUTRAS FUN��ES///////////////////////////////////////////////////////////////////////////////////////////////
	public void escolherCurso() 
	{
		
		System.out.println(this.menu);
		
		try {
			
			System.out.println("\nDigite o n�mero do segmento de sua escolha: "
					+ "\n1 - Tecnologia"
					+ "\n2 - Marketing"
					+ "\n3 - Contabilidade e Finan�as");
			int segmento = leia.nextInt();
			leia.nextLine();
			
			while (segmento < 1 || segmento > 3) {
				System.out.println("\nOp��o inv�lida. Escolha o seu curso: "
						+ "\n1 - Tecnologia"
						+ "\n2 - Marketing"
						+ "\n3 - Contabilidade e Finan�as");
				segmento = leia.nextInt();
				leia.nextLine();
			}
			
			switch(segmento) {
			case 1:
				setSegmento("Tecnologia");
				System.out.println("\nEscolha o seu curso: "
						+ "\n1 - Design"
						+ "\n2 - Data Science"
						+ "\n3 - Desenvolvimento Web");
				int escolha = leia.nextInt();
				leia.nextLine();
				
				while (escolha < 1 || escolha > 3) {
					System.out.println("\nOp��o inv�lida. Escolha o seu curso: "
							+ "\n1 - Design "
							+ "\n2 - Data Science "
							+ "\n3 - Desenvolvimento Web");
					escolha = leia.nextInt();
					leia.nextLine();
						
				}
				
				switch(escolha) {
				case 1: 
					setCurso("Design");
				break;
				case 2:
					setCurso("Data Science");
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
				leia.nextLine();
				
				while (escolher < 1 || escolher > 2) {
					System.out.println("\nOp��o inv�lida. Escolha o seu curso: "
							+ "\n1 - Neuromarketing "
							+ "\n2 - Marketing Digital");
					escolher = leia.nextInt();
					leia.nextLine();
						
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
				setSegmento("Contabilidade e Finan�as");
				System.out.println("\nEscolha o seu curso: "
						+ "\n1 - Matem�tica Financeira"
						+ "\n2 - Controladoria\n3 - An�lise de balan�os");
				int escolh = leia.nextInt();
				leia.nextLine();
				
				while (escolh < 1 || escolh > 3) {
					System.out.println("\nOp��o inv�lida. Escolha o seu curso: "
							+ "\n1 - Matem�tica Financeira "
							+ "\n2 - Controladoria "
							+ "\n3 - An�lise de balan�os");
					escolh = leia.nextInt();
					leia.nextLine();
						
				}
				
				switch(escolh) {
				case 1:
					setCurso("Matem�tica Financeira");
				break;
				case 2:
					setCurso("Controladoria");
				break;
				case 3:
					setCurso("An�lise de balan�os");
				break;
				}
			break;
							
			
		}
			
		} catch (InputMismatchException e) 
		{
			System.out.println("Tipo de dado invalido, digite o n�mero correspondente ao curso escolhido.");
			
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
