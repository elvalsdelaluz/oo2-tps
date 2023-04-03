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
	
	public boolean equals (Topografia topo) {    ///Sabemos que this es una topografia Simple, pero no sabemos si topo es Simple o Mixta 
		return topo.compararContraSimple(this);  //Lo que hacemos es mandar a this(SIMPLE) para que se compare contra topo.
	}                                            //En el caso de que topo sea Simple se va a ejecutar el método compararContraSimple de la subclase
	                                             //En caso de que topo sea Mixta se va a ejecutar el método comparaContraSimple de la superClase

	
	
	public boolean compararContraSimple(Simple simple) {      //Una topografia simple puede tener proporcion de agua 0, 1 o 0.7
		return this.proporcionAgua == simple.proporcionAgua;  
	}


	
}
