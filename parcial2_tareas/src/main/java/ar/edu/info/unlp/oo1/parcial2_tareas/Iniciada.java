package ar.edu.info.unlp.oo1.parcial2_tareas;

public class Iniciada extends EstadoTarea {
	
	 public void completar(TareaSimple tarea) {
//			tarea.setInicio(System.out.currentTimeMillis()); //El el test seteo el valor de ini y fin para tener un poco de control.
			tarea.cambiarEstado(new Completada());
	 }

}
