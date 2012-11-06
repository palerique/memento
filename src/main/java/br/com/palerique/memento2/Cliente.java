package br.com.palerique.memento2;

public class Cliente {

	public static void main(String[] args) {

		// Objeto que desejo recuperar o estado - Originador
		Pessoa p = new Pessoa();
		p.setNome("Amanda");

		// Originador que administrará a lista de Mementos - Caretaker
		ZeladorPessoa zelador = new ZeladorPessoa();

		// O zelador vai criar o memento e armazenar na lista
		zelador.adicionar(p);

		// Altero várias vezes o estado do meu objeto
		p.setNome("Paula");
		p.setNome("Juliana");
		p.setNome("Nicole");

		// Peço para o zelador o ultimo estado!
		p = zelador.pegarOUltimo();

	}

}
