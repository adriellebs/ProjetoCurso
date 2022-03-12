package Projeto;
import java.util.Scanner;

public class Cursos {
	
	Scanner leia = new Scanner(System.in);
	
	private String segmento;
	private String professor;
	private String curso;
	private String escolhaCurso;
	
	public Cursos (String curso, String professor, String segmento, String escolhaCurso)
	{
		this.segmento = segmento;
		this.professor = professor;
		this.curso = curso;
		this.escolhaCurso = escolhaCurso;
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
		return professor;
	}

	public void setProfessora() {
		this.professor = leia.nextLine();
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

	public void escolherCurso() {
		System.out.println("\nDigite o número do segmento de sua escolha: \n1 - Tecnologia\n2 - Marketing\n3 - Contabilidade e Finanças");
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
			int escolha2 = leia.nextInt();
			switch(escolha2) {
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
		
		System.out.println("teste: você escolheu o curso: " + getCurso() +", do segmento: " + getSegmento());
		
	}
}
