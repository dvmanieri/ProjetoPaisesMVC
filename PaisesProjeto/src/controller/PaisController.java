package controller;

import java.util.ArrayList;
import java.util.List;

import model.Pais;
import view.PaisView;

public class PaisController {

	private PaisView paisView;
	private List<Pais> listaPaises; 

	//esse método construtor serve para que o array e a lista de paises só inicialize após criar um objeto dá classe
	public PaisController() {
		paisView = new PaisView();
		listaPaises = new ArrayList<>();
	}

	//esse método cria um objeto do tipo país e coloca dentro do meu ArrayList de país
	public void adicionarPais(String nome, String capital) {
		Pais pais = new Pais(nome, capital);
		listaPaises.add(pais);

	}
	//esse método chama outro método dá classe de view
	public void exibirPais() {
		paisView.exibirPaises(listaPaises);
	}
	//esse método usa uma das funcionalidades do ArrayList
	public void excluirPaises() {
		listaPaises.clear();
	}
	//esse método usa outra funcionalidade do ArrayList
	public void removerPais(String pais) {
	//aqui eu faço um for e uma condicional para tratar do nome passado pelo usuário
		int tamanhoLista = listaPaises.size();
		for (int i = 0; i < tamanhoLista; i++) { 
			if (listaPaises.get(i).getNome().equals(pais)) {
				listaPaises.remove(i);
				break;
			}

		}
	//aqui temos a mesma coisa só que feita atravez de um foreach	
		for (Pais paiss : listaPaises) {
			if (paiss.getNome().equals(pais)) {
				listaPaises.remove(paiss);
				break;
			}
		}
	}
}
