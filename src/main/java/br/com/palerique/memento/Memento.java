package br.com.palerique.memento;

/**
 * 
 * Originador é o objeto que tem o estado interno que desejamos recuperar. O
 * memento representará o estado interno do objeto Originador!!!
 * 
 * @author ph - palerique@gmail.com
 * 
 */
class Originador {
	private String estado;

	public void setEstado(String estado) {
		System.out.println("Originador: Definindo estado para " + estado);
		this.estado = estado;
	}

	public Memento salvarParaOMemento() {
		System.out.println("Originador: Salvando no Memento.");
		return new Memento(estado);
	}

	public void recuperarDoMemento(Memento memento) {
		estado = memento.recuperarEstadoSalvo();
		System.out.println("Originador: Estado após recuperar do Memento: "
				+ estado);
	}

	/**
	 * 
	 * Memento quer dizer lembrete, modelo...
	 * 
	 * É algo que te faz lembrar de algo/alguém...
	 * 
	 * Esse objeto vai representar o estado de algum outro objeto!
	 * 
	 * @author ph - palerique@gmail.com
	 * 
	 */
	public static class Memento {
		private final String estado;

		public Memento(String estadoASalvar) {
			estado = estadoASalvar;
		}

		public String recuperarEstadoSalvo() {
			return estado;
		}
	}
}
