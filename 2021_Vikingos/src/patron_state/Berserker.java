package patron_state;

public class Berserker extends EstadoVikingo {

	@Override
	public EstadoVikingo meditar() {
		return EstadoVikingo.normal;
	}

	@Override
	public EstadoVikingo atacar() {
		return this;
	}

	@Override
	public EstadoVikingo recibirAtaque() {
		return this;
	}
	
	public double multiplicadorAtaque() {
		return 3;
	}
	
	public double multiplicadorDefensa() {
		return 0.5;
	}

	@Override
	public String toString() {
		return "Berserker";
	}
}
