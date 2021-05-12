package patron_state;

public abstract class Estado {

	public Estado atacar(Vikingo vikingo) {
		return this;
	}

	public Estado recibirAtaque(Vikingo vikingo, int danio) {
		return this;
	}

	public Estado meditar(Vikingo vikingo) {
		return this;
	}

}
