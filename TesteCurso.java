package Projeto;

import java.util.Scanner;

public class TesteCurso  {

	public static void main(String[] args) {
		
		ListaCursos lista = new ListaCursos("Projeto", "Tech", "Contabilidade", "Marketing");
		int op;
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\n---------------------------------------------");
			System.out.println("\n Bem vindo!!! Digite sua op��o: ");
			System.out.println("\n (1) Conhecer os cursos ");
			System.out.println("\n (2) Cadastrar - Pessoa F�sica ");
			System.out.println("\n (3) Cadastrar - Pessoa Jur�dica ");
			System.out.println("\n (0) Sair da p�gina ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nBem vindo ao nosso Projeto!!!"
						+ "\nOs cursos dispon�veis, s�o:"
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
