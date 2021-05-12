package patron_state;

public abstract class EstadoVikingo {
	
	protected static final EstadoVikingo normal = new Normal();
	protected static final EstadoVikingo calmado = new Calmado();
	protected static final EstadoVikingo colerico = new Colerico();
	protected static final EstadoVikingo berserker = new Berserker();
	
	public EstadoVikingo meditar() {
		return this;
	}
	public EstadoVikingo atacar() {
		return this;
	}
	public EstadoVikingo recibirAtaque() {
		return this;
	}
	
	public abstract int multiplicadorAtaque(int danio);
	
	public abstract int multiplicadorDefensa(int danio);
	
}
