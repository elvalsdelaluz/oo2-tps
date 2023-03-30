package ejer4_topografias;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */

public class Simple extends Topografia {
	private double proporcionAgua;
	
	public static Simple agua() {
		return new Simple(1);
	}
	public static Simple tierra() {
		return new Simple(0);
	}
	public static Simple pantano() {
		return new Simple(0.7);
	}
	
	private Simple (double agua) {
		this.proporcionAgua = agua;
	}

	@Override
	public double calcularProporcionAgua() {
		return this.proporcionAgua;
	}

	@Override
	public double calcularProporcionTierra() {
		return 1- proporcionAgua;
	}
	
	public boolean equals (Topografia topo) {
		return topo.compararContraSimple(this);
		
	}
	
	public boolean compararContraSimple(Simple simple) {
		return this.proporcionAgua == simple.proporcionAgua;
	}


	
}
