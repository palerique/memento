package br.com.palerique.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * O objeto originalmente se chama Caretaker e tem a função de cuidar da lista
 * de mementos do aplicativo.
 * 
 * @author ph - palerique@gmail.com
 * 
 */
public class Zelador {
	public static void main(String[] args) {
		List<Originador.Memento> estadosSalvos = new ArrayList<Originador.Memento>();

		Originador originador = new Originador();
		originador
				.setEstado("A aranha arranha a rã. A rã arranha a aranha. Nem a aranha arranha a rã. Nem a rã arranha a aranha.");
		originador.setEstado("Teto limpo chão sujo");
		estadosSalvos.add(originador.salvarParaOMemento());
		originador.setEstado("Três pratos de trigo para três tigres tristes.");

		estadosSalvos.add(originador.salvarParaOMemento());
		originador.setEstado("O peito do pé de Pedro é preto.");

		originador.recuperarDoMemento(estadosSalvos.get(1));
	}
}
