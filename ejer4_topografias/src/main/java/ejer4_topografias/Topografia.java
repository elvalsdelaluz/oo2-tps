package ejer4_topografias;

public abstract class Topografia{
	
	//Métodos
	abstract public double calcularProporcionAgua(); 
	
	abstract public double calcularProporcionTierra(); 
	
	public  abstract boolean equals(Topografia topo);
	
//	public boolean compararIgualdad(Topografia topo2) {	
//		return this.calcularProporcionAgua() == topo2.calcularProporcionAgua();
//	}

	public boolean equals(Object o) {
		if (o == null) return false;
		if (o instanceof Topografia) {
			return this.equals((Topografia) o);
		}
		return false;
	}
	
	public boolean compararContraSimple(Simple simple) { //Este método se ejecuta si la clase topo es Mixta
		return false;                                    
	}

	public boolean compararContraMixta(Mixta mixta) { //Este método se ejecuta si la clase topo es Simple
		return false;
	}

}
