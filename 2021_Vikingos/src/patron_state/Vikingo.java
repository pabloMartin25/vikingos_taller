package patron_state;

public class Vikingo {
	private EstadoVikingo estado = EstadoVikingo.normal;
	private int vida = 100;
	private int danio = 10;

	public void meditar() {
		estado = estado.meditar();
	}

	public void atacar(Vikingo enemigo) {
		enemigo.recibirAtaque(estado.multiplicadorAtaque(danio));
		estado = estado.atacar();
	}

	public void recibirAtaque(int danio) {
		vida -= estado.multiplicadorDefensa(danio);
		estado = estado.recibirAtaque();
	}

	@Override
	public String toString() {
		return "Vida: " + vida + "\tEstado: " + estado.toString();
	}

	public static void main(String[] args) {
		Vikingo v = new Vikingo();
		Vikingo vTest = new Vikingo();

		System.out.println(vTest);
		v.atacar(vTest);
		System.out.println(vTest);
		v.atacar(vTest);
		System.out.println(vTest);
		v.atacar(vTest);
		System.out.println(vTest);
		vTest.meditar();
		System.out.println(vTest);
		vTest.meditar();
		System.out.println(vTest);
		v.atacar(vTest);
		System.out.println(vTest);

	}

}
