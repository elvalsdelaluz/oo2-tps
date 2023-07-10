package ar.edu.info.unlp.oo1.parcial2_tareas;

public abstract class Tarea {
	protected String descripcion;
	
	public Tarea(String descripcion) {
		this.descripcion = descripcion;		
	}
	
	abstract int estimacionTotal();
	abstract int tiempoUtilizado();
	abstract double avance();
	abstract void iniciar();
	abstract void completar();

}
