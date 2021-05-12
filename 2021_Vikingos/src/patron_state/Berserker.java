package patron_state;

public class Berserker extends EstadoVikingo {

	@Override
	public EstadoVikingo meditar() {
		return EstadoVikingo.normal;
	}

	@Override
	public int multiplicadorAtaque(int danio) {
		// TODO Auto-generated method stub
		return 3 * danio;
	}

	@Override
	public int multiplicadorDefensa(int danio) {
		// TODO Auto-generated method stub
		return danio / 2;
	}

	@Override
	public String toString() {
		return "Berserker";
	}
}
