package view;

import java.util.List;

import model.Pais;

public class PaisView {
		public void exibirPaises(List<Pais> paises) {
			System.out.println("===== Aqui estão os seus paises =====");
			for(Pais pais : paises) {
				System.out.println("Pais: "+pais.getNome());
				System.out.println("capital: "+pais.getCapital());
				System.out.println("====================================");
				System.out.println(" ");
			
			}
		}
}
