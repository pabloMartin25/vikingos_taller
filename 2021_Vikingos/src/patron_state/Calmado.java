package patron_state;

public class Calmado extends EstadoVikingo {

	@Override
	public EstadoVikingo meditar() {
		return this;
	}

	@Override
	public EstadoVikingo atacar() {
		return EstadoVikingo.normal;
	}

	@Override
	public EstadoVikingo recibirAtaque() {
		return this;
	}
	
	public double multiplicadorDefensa() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Calmado";
	}
}
