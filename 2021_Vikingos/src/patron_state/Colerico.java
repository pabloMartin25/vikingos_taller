package patron_state;

public class Colerico extends EstadoVikingo {

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
		return EstadoVikingo.berserker;
	}
	
	public double multiplicadorAtaque() {
		return 2;
	}
	
	public double multiplicadorDefensa() {
		return 2;
	}

	@Override
	public String toString() {
		return "Colerico";
	}


}
