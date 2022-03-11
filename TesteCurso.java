package Projeto;

import java.io.IOException;
import java.util.Scanner;

public class TesteCurso  {

	public static void main(String[] args) {
		
		ListaCursos lista = new ListaCursos("Tech", "Contabilidade", "Marketing");
		int op;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\n---------------------------------------------");
			System.out.println("\n Bem vindo!!! Digite sua opção: ");
			System.out.println("\n (1) Conhecer os cursos ");
			System.out.println("\n (2) Cadastrar - Pessoa Física ");
			System.out.println("\n (3) Cadastrar - Pessoa Jurídica ");
			System.out.println("\n (0) Sair da página ");
			op = leia.nextInt();
			switch(op){
			case 1:
				leia.nextLine();
				System.out.println("\nBem vindo ao nosso Projeto!!!"
						+ "\nOs cursos disponíveis, são:\n"
						+ "\t"+lista.getCurso1()+"\n"
						+"\t"+ lista.getCurso2()+"\n"
						+"\t"+ lista.getCurso3()+"\n");
				
				System.out.println("Pressione um botão para continuar....");
				String pressione = leia.nextLine();
				
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite seu nome: ");
				break;
			}
			
		}while(op!=0);
				
	}

}
