package controller;

import java.util.ArrayList;
import java.util.List;

import model.Pais;
import view.PaisView;

public class PaisController {

	private PaisView paisView;
	private List<Pais> listaPaises; 

	//esse m�todo construtor serve para que o array e a lista de paises s� inicialize ap�s criar um objeto d� classe
	public PaisController() {
		paisView = new PaisView();
		listaPaises = new ArrayList<>();
	}

	//esse m�todo cria um objeto do tipo pa�s e coloca dentro do meu ArrayList de pa�s
	public void adicionarPais(String nome, String capital) {
		Pais pais = new Pais(nome, capital);
		listaPaises.add(pais);

	}
	//esse m�todo chama outro m�todo d� classe de view
	public void exibirPais() {
		paisView.exibirPaises(listaPaises);
	}
	//esse m�todo usa uma das funcionalidades do ArrayList
	public void excluirPaises() {
		listaPaises.clear();
	}
	//esse m�todo usa outra funcionalidade do ArrayList
	public void removerPais(String pais) {
	//aqui eu fa�o um for e uma condicional para tratar do nome passado pelo usu�rio
		int tamanhoLista = listaPaises.size();
		for (int i = 0; i < tamanhoLista; i++) { 
			if (listaPaises.get(i).getNome().equals(pais)) {
				listaPaises.remove(i);
				break;
			}

		}
	//aqui temos a mesma coisa s� que feita atravez de um foreach	
		for (Pais paiss : listaPaises) {
			if (paiss.getNome().equals(pais)) {
				listaPaises.remove(paiss);
				break;
			}
		}
	}
}
