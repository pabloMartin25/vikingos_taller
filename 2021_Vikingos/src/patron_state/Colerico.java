package patron_state;

public class Colerico extends Estado {

	@Override
	public Estado recibirAtaque(Vikingo vikingo, int danio) {
		// TODO Auto-generated method stub
		vikingo.descontarVida(danio * 2);
		vikingo.setDanio(30);
		return new Berserker();
	}

	@Override
	public Estado meditar(Vikingo vikingo) {
		// TODO Auto-generated method stub
		vikingo.setDanio(10);
		return new Normal();
	}

	@Override
	public String toString() {
		return "Colerico []";
	}

}
