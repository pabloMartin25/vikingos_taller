package patron_state;

public class Calmado extends EstadoVikingo {

	@Override
	public EstadoVikingo atacar() {
		return EstadoVikingo.normal;
	}

	@Override
	public int multiplicadorAtaque(int danio) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multiplicadorDefensa(int danio) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Calmado";
	}

}
