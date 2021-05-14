package implementacion_if;

public class Vikingo {
	private int vida = 100;
	private float debilidad = 1;
	private int danio = 10;
	private String estado = "Normal";
	private boolean recibirAtaque = false;
	private boolean meditar = false;
	
	public void Estado() {
		if(estado == "Normal") {
			normal();
		}
		if(estado == "Colerico") {
			Colerico();
		}
		if(estado == "Berserker") {
			Berserker();
		}
		if(estado == "Calmado") {
			calmado();
		}	
	}

	public void normal(){
		if(recibirAtaque == true) {
			recibirAtaque = false;
			estado = "Colerico";
		}
		if(meditar == true) {
			estado = "Calmado";
		}
	}

	public void calmado() {
		danio = 10;
		debilidad = 0;
		if(recibirAtaque == true) {
			recibirAtaque = false;
		}
		if(meditar == true) {
			estado = "Calmado";
		}
	}
	
	public void Colerico() {
		danio = danio * 2;
		debilidad = 2;
		if(recibirAtaque == true) {
			recibirAtaque = false;
			estado = "Berserker";
		}
		if(meditar == true) {
			estado = "Normal";
		}
	}
	
	public void Berserker() {
		danio = danio * 3;
		debilidad = (float) 0.5;
		if(recibirAtaque == true) {
			recibirAtaque = false;
		}
		if(meditar == true) {
			estado = "Normal";
		}
	}
	
	public void Meditar() {
		meditar = true;
		Estado();
	}

	public void Atacar(Vikingo enemigo) {
		enemigo.vida -= danio * enemigo.debilidad;
		enemigo.recibirAtaque = true;
		if(estado == "Calmado") {
			estado = "Normal";
		}
		enemigo.Estado();
	}
	
	@Override
	public String toString() {
		return "Vida: " + vida+"	"+ "Estado: " + estado;
	}


	public static void main(String[] args) {
		Vikingo v = new Vikingo();
		Vikingo e = new Vikingo();

		System.out.println(v);
		e.Atacar(v);
		System.out.println(v);
		e.Atacar(v);
		System.out.println(v);
		e.Atacar(v);
		System.out.println(v);
		v.Meditar();
		System.out.println(v);
		v.Meditar();
		System.out.println(v);
		v.Meditar();
		System.out.println(v);
		e.Atacar(v);
		System.out.println(v);
		v.Atacar(e);
		System.out.println(e);
	}
}
