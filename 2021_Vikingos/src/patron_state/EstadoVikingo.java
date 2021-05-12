package patron_state;

public abstract class EstadoVikingo {
	
	protected static final EstadoVikingo normal = new Normal();
	protected static final EstadoVikingo calmado = new Calmado();
	protected static final EstadoVikingo colerico = new Colerico();
	protected static final EstadoVikingo berserker = new Berserker();
	
	public abstract EstadoVikingo meditar();
	public abstract EstadoVikingo atacar();
	public abstract EstadoVikingo recibirAtaque();
	
	public double multiplicadorAtaque() {
		return 1;
	}
	
	public double multiplicadorDefensa() {
		return 1;
	}
	
}
