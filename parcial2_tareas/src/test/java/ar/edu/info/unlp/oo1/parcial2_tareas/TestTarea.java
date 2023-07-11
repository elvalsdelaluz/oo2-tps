package ar.edu.info.unlp.oo1.parcial2_tareas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTarea {
	private TareaSimple t3, t4, t5, t6; //SI LE PONGO DE TIPO TAREA NO VOY A PODER ACCEDER
	                                        //A LOS SETTER AJFDKSAJFKAFASFHKAFDHKJSKFJDFK
	private TareaCompleja tareaComplejaExterna;
	//private Tarea tareaComplejaInterna; // esto me tira un ERROR
	private TareaCompleja tareaComplejaInterna; 

	@BeforeEach
	void setUp() throws Exception {
		
		this.t4 = new TareaSimple("Ir a la verduleria", 1);
		this.t3 = new TareaSimple("Ir al supermercado", 3);
		tareaComplejaInterna = new TareaCompleja("RealizarCompras");
		tareaComplejaInterna.agregarTarea(t3);
		tareaComplejaInterna.agregarTarea(t4);

		
		this.t6 = new TareaSimple ("Preparar la mesa", 1);
		this.t5 = new TareaSimple ("Cocinar", 2);
		
		tareaComplejaExterna = new TareaCompleja("Preparar almuerzo");
		tareaComplejaExterna.agregarTarea(tareaComplejaInterna);
		tareaComplejaExterna.agregarTarea(t5);
		tareaComplejaExterna.agregarTarea(t6);
		
		//SI DEFINO UNA VARIABLE ACA NO ME LA DEJA USAR EN EL ASSERT
		//TENGO QUE DEFINIRLA AFUERA DEL SETUP
	}
	

	@Test
	void testAvance() {
	    //assertEquals(0, tareaComplejaExterna.avance());
	    //tareaComplejaExterna.iniciar();
	    //assertEquals(0, tareaComplejaExterna.avance());
	    //tareaComplejaExterna.completar();
	    t4.setInicio(11);
	    t4.setFin(12);
	    t4.iniciar();
	    t4.completar();
	    t3.setInicio(9);
	    t3.setFin(11);
	    t3.iniciar();
	    t3.completar();
	    t5.setInicio(12);
	    t5.iniciar();
	    assertEquals(0.43, tareaComplejaExterna.avance());
	}

}
