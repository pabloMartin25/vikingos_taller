package patron_state;

public class Calmado extends Estado {

	@Override
	public Estado atacar(Vikingo vikingo) {
		// TODO Auto-generated method stub
		vikingo.setDanio(10);
		return new Normal();
	}

	@Override
	public Estado recibirAtaque(Vikingo vikingo, int danio) {
		// TODO Auto-generated method stub
		vikingo.setDanio(10);
		return new Normal();
	}

	@Override
	public String toString() {
		return "Calmado []";
	}

}
