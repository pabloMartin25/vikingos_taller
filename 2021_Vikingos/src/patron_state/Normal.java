package patron_state;

public class Normal extends EstadoVikingo {

	@Override
	public EstadoVikingo meditar() {
		// TODO Auto-generated method stub
		return EstadoVikingo.calmado;
	}

	@Override
	public EstadoVikingo recibirAtaque() {
		// TODO Auto-generated method stub
		return EstadoVikingo.colerico;
	}

	@Override
	public int multiplicadorAtaque(int danio) {
		// TODO Auto-generated method stub
		return danio;
	}

	@Override
	public int multiplicadorDefensa(int danio) {
		// TODO Auto-generated method stub
		return danio;
	}

	@Override
	public String toString() {
		return "Normal";
	}
}
