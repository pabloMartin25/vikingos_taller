package patron_state;

public class Normal extends Estado {

	@Override
	public Estado recibirAtaque(Vikingo vikingo, int danio) {
		// TODO Auto-generated method stub
		vikingo.descontarVida(danio);
		vikingo.setDanio(20);
		return new Colerico();
	}

	@Override
	public Estado meditar(Vikingo vikingo) {
		// TODO Auto-generated method stub
		return new Calmado();
	}

	@Override
	public String toString() {
		return "Normal []";
	}

}
