package ProjetoDH_Grupo1_Cursos;

import java.util.Scanner;

public class TesteCurso  {

	public static void main(String[] args) {
		
		ListaCursos lista = new ListaCursos("Projeto", "Tech", "Contabilidade", "Marketing");
		int op;
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\n---------------------------------------------");
			System.out.println("\n Bem vindo!!! Digite sua opção: ");
			System.out.println("\n (1) Conhecer os cursos ");
			System.out.println("\n (2) Cadastrar - Pessoa Física ");
			System.out.println("\n (3) Cadastrar - Pessoa Jurídica ");
			System.out.println("\n (0) Sair da página ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nBem vindo ao nosso Projeto!!!"
						+ "\nOs cursos disponíveis, são:"
						+ "\nTech"
						+ "\nContabilidade"
						+ "\nMarketing");
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite seu nome: ");
			}
			
		}
		while(op != 0);

		
		

				
	}

}
