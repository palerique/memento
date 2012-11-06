package br.com.palerique.memento2;

/**
 * 
 * Pessoa - Originador - é o objeto que tem o estado interno que desejamos
 * recuperar. O memento representará o estado interno do objeto Pessoa!!!
 * 
 * @author ph - palerique@gmail.com
 * 
 */
public class Pessoa {
	private String nome;

	public void setNome(String nome) {
		System.out.println("Originador: Definindo nome para " + nome);
		this.nome = nome;
	}

	public Memento reproduzirEstadoEmUmMemento() {
		System.out.println("Originador: Salvando no Memento.");
		return new Memento(nome);
	}

	public Pessoa recuperarDoMemento(Memento memento) {
		this.setNome(memento.recuperarEstadoSalvo());
		System.out.println("Originador: Estado após recuperar do Memento: "
				+ this.nome);
		return this;
	}

	/**
	 * 
	 * Memento quer dizer lembrete, modelo...
	 * 
	 * É algo que te faz lembrar de algo/alguém...
	 * 
	 * Esse objeto vai representar o nome de algum outro objeto!
	 * 
	 * @author ph - palerique@gmail.com
	 * 
	 */
	public static class Memento {
		private final String nome;

		public Memento(String estadoASalvar) {
			nome = estadoASalvar;
		}

		public String recuperarEstadoSalvo() {
			return nome;
		}
	}

	public String getNome() {
		return nome;
	}
}
