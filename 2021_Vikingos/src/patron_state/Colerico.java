package patron_state;

public class Colerico extends EstadoVikingo {

	@Override
	public EstadoVikingo meditar() {
		return EstadoVikingo.normal;
	}

	@Override
	public EstadoVikingo recibirAtaque() {
		return EstadoVikingo.berserker;
	}

	public int multiplicadorAtaque(int danio) {
		return 2 * danio;
	}

	public int multiplicadorDefensa(int danio) {
		return 2 * danio;
	}

	@Override
	public String toString() {
		return "Colerico";
	}

}
