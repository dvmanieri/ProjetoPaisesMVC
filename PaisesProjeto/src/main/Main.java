package main;

import java.util.Scanner;

import controller.PaisController;
import model.Pais;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PaisController paisControler = new PaisController();

		int contador = 10;

		while (contador != 0) {
			System.out.println("===== PAISES & CAPITAL =====");
			System.out.println("1. Adicionar pa�s.");
			System.out.println("2. Exibir pa�s.");
			System.out.println("3. Remover pa�ses.");
			System.out.println("4. Limpar lista de pa�ses.");
			System.out.println("0. Sair.");

			contador = scan.nextInt();

			if (contador == 1) {
				scan.nextLine();
				System.out.println("Digite o nome do pa�s: ");
				String adicionaPais = scan.nextLine();
				System.out.println("Digite a capital do pa�s " + adicionaPais);
				String adicionaCapital = scan.nextLine();
				paisControler.adicionarPais(adicionaPais, adicionaCapital);
			}

			else if (contador == 2) {
				paisControler.exibirPais();

			} else if (contador == 3) {
				scan.nextLine();
				System.out.println("Digite o nome do pais  que vc quer remover: ");
				String removePais = scan.nextLine();
				paisControler.removerPais(removePais);
			} else if (contador == 4) {
				paisControler.excluirPaises();
			}
			
		}

	}

}
