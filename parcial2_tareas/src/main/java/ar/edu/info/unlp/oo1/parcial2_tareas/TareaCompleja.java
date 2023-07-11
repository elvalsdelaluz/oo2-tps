package ar.edu.info.unlp.oo1.parcial2_tareas;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja extends Tarea {
	private List<Tarea> tareas;
	
	public TareaCompleja (String descripcion) {
		super(descripcion);
		this.tareas = new ArrayList<Tarea>();
	}
	
	public void agregarTarea(Tarea tarea) {
		this.tareas.add(tarea);
	}

	@Override
	int estimacionTotal() {
		return this.tareas.stream().mapToInt(tarea -> tarea.estimacionTotal()).sum();
	}

	@Override
	int tiempoUtilizado() {
		return this.tareas.stream().mapToInt(tarea -> tarea.tiempoUtilizado()).sum();
	}
    
	
	@Override
    void iniciar() {
		this.tareas.forEach(tarea -> tarea.iniciar());
		
	}

	@Override
	void completar() {
		this.tareas.forEach(tarea -> tarea.completar());
		
	}
	
	

}
