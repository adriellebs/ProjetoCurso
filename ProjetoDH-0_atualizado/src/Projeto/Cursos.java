package Projeto;
import java.util.Scanner;

public class Cursos {
	
	Scanner leia = new Scanner(System.in);
	
	private String segmento;
	private String professora;
	private String curso;
	private String escolhaCurso;
	private String aluno;
	private String menu;
	
	public Cursos (String curso, String professora, String segmento, String escolhaCurso, String aluno, String menu)
	{
		this.segmento = segmento;
		this.professora = professora;
		this.curso = curso;
		this.escolhaCurso = escolhaCurso;
		this.aluno = aluno;
		this.menu = menu;
	}

	public Cursos() {
		
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getProfessora() {
		return professora;
	}

	public void setProfessora() {
		this.professora = professora;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getEscolhaCurso() {
		return escolhaCurso;
	}

	public void setEscolhaCurso(String escolhaCurso) {
		this.escolhaCurso = escolhaCurso;
	}
	
	public String getAluno() {
		return aluno;
	}

	public void setAluno() {
		this.aluno = aluno;
	}
	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public void escolherCurso() {
		
		System.out.println("\nDigite 0 para vizualizar o menu ou número do segmento de sua escolha: \n1 - Tecnologia\n2 - Marketing\n3 - Contabilidade e Finanças");
			int segmento = leia.nextInt();
		
			switch(segmento) {
			case 1:
				setSegmento("Tecnologia");
				System.out.println("\nEscolha o seu curso: \n1 - Design\n2 - Data Science\n3 - Desenvolvimento Web");
				int escolha = leia.nextInt();
			
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
			case 0:
				setMenu("Os segmentos e cursos disponiveis são:\n"
						+ "Tecnologia: \nDesign"
						+ "\nData Science\n"
						+ "Desenvolvimento Web\n\n"
						+ "Marketing:"
						+ "\nNeuromarketing\n"
						+ "Marketing Digital"
						+ "\n\nContabilidade e Finanças:\n"
						+ "Matemática Financeira\n"
						+ "Controladoria\n"
						+ "Análise de Balanços");
				System.out.println(getMenu());
			break;
		}
				System.out.println("\n\nteste: você escolheu o curso: " + getCurso() +", do segmento: " + getSegmento());
	}
		
}
