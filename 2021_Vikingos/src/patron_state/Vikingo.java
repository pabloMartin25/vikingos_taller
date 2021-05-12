package patron_state;

public class Vikingo {
	private int vida = 100;
	private Estado estadoVikingo = new Normal();
	private int danio = 10;

	public void setDanio(int danio) {
		this.danio = danio;
	}

	public void descontarVida(int danio) {
		this.vida -= danio;
	}

	public void atacar(Vikingo enemigo) {
		enemigo.recibirAtaque(this);
		estadoVikingo = estadoVikingo.atacar(this);
	}

	public void recibirAtaque(Vikingo enemigo) {
		estadoVikingo = estadoVikingo.recibirAtaque(this, enemigo.danio);
	}

	public void meditar() {
		estadoVikingo = estadoVikingo.meditar(this);
	}

	@Override
	public String toString() {
		return "Vikingo [vida=" + vida + ", estadoVikingo=" + estadoVikingo.toString() + ", danio=" + danio + "]";
	}

	public static void main(String[] args) {
		Vikingo v = new Vikingo();
		System.out.println(v);
		v.recibirAtaque(new Vikingo());
		System.out.println(v);
	}

}
