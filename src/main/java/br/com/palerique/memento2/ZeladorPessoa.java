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
