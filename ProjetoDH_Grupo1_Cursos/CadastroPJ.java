package ProjetoDH_Grupo1_Cursos;

public class CadastroPJ extends ProjetoCurso{
	
	private int cnpj;
	private String segmento;
	

	public CadastroPJ(String nome, String endereco, int telefone, 
			int cnpj, String segmento) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.segmento = segmento;
		
	}


	public int getCnpj() {
		return cnpj;
	}


	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}


	public String getSegmento() {
		return segmento;
	}


	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

}
