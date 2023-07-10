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
    
	double avance() {
		//return this.tareas.stream().mapToDouble(tarea -> tarea.avance()).sum(); //No se pide esto
		//return this.tareas.stream().mapToDouble(tarea -> (tarea.tiempoUtilizado()/tarea.estimacionTotal())).sum(); //El sum no va ¿Que flashe?
		
		//return this.tareas.stream().mapToDouble(tarea -> tarea.tiempoUtilizado()).sum()/   
		//	   this.tareas.stream().mapToDouble(tarea -> tarea.estimacionTotal()).sum();  //Va queriendo pero estoy reinventando?
		//System.out.println(tiempoUtilizado()+ " "+estimacionTotal());
		
		return (double) this.tiempoUtilizado()/this.estimacionTotal(); //Esta es la que va!
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
