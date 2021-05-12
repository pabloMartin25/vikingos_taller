package patron_state;

public class Normal extends EstadoVikingo {

	@Override
	public EstadoVikingo meditar() {
		// TODO Auto-generated method stub
		return EstadoVikingo.calmado;
	}

	@Override
	public EstadoVikingo atacar() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public EstadoVikingo recibirAtaque() {
		// TODO Auto-generated method stub
		return EstadoVikingo.colerico;
	}

	@Override
	public String toString() {
		return "Normal";
	}
	
}
