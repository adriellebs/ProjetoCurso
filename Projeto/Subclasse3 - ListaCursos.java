package Projeto;

public class ListaCursos extends ProjetoCurso{

	private String curso1,curso2,curso3;
	
	
	public ListaCursos(String nome, String curso1, String curso2, String curso3) 
	{
		super(nome);
		this.curso1 = curso1;
		this.curso2 = curso2;
		this.curso3 = curso3;
		
	}



	public String getCurso1() {
		return curso1;
	}



	public void setCurso1(String curso1) {
		this.curso1 = curso1;
	}



	public String getCurso2() {
		return curso2;
	}



	public void setCurso2(String curso2) {
		this.curso2 = curso2;
	}



	public String getCurso3() {
		return curso3;
	}



	public void setCurso3(String curso3) {
		this.curso3 = curso3;
	}
	

}


