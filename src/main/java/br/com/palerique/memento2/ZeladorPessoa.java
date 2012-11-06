package br.com.palerique.memento2;

import java.util.ArrayList;
import java.util.List;

import br.com.palerique.memento2.Pessoa.Memento;

/**
 * 
 * O objeto originalmente se chama Caretaker e tem a função de cuidar da lista
 * de mementos do aplicativo.
 * 
 * @author ph - palerique@gmail.com
 * 
 */
public class ZeladorPessoa {

	/*
	 * public static void main(String[] args) { List<Originador.Memento>
	 * estadosSalvos = new ArrayList<Originador.Memento>();
	 * 
	 * Originador originador = new Originador(); originador .setEstado(
	 * "A aranha arranha a rã. A rã arranha a aranha. Nem a aranha arranha a rã. Nem a rã arranha a aranha."
	 * ); originador.setEstado("Teto limpo chão sujo");
	 * estadosSalvos.add(originador.salvarParaOMemento());
	 * originador.setEstado("Três pratos de trigo para três tigres tristes.");
	 * 
	 * estadosSalvos.add(originador.salvarParaOMemento());
	 * originador.setEstado("O peito do pé de Pedro é preto.");
	 * 
	 * originador.recuperarDoMemento(estadosSalvos.get(1)); }
	 */

	private List<Pessoa.Memento> mementos;
	private Memento ultimo;

	public ZeladorPessoa() {
		mementos = new ArrayList<Pessoa.Memento>();
	}

	void adicionar(Pessoa pessoa) {
		Memento memento = pessoa.reproduzirEstadoEmUmMemento();
		mementos.add(memento);
		ultimo = memento;
	}

	void removerUltimo() {
		if (ultimo != null) {
			mementos.remove(ultimo);
			ultimo = null;
		}
	}

	Pessoa pegarOUltimo() {
		return new Pessoa().recuperarDoMemento(ultimo);
	}

}
