package ar.edu.info.unlp.oo1.parcial2_tareas;

public class TareaSimple extends Tarea{
	private int duracionEstimada;
	private int inicio;
	private int fin;
	private EstadoTarea estado;
	
	public TareaSimple (String descripcion, int duracionEstimada) {
		super(descripcion);
		this.duracionEstimada= duracionEstimada;
		this.estado = new NoIniciada();	
	}

	@Override
	int estimacionTotal() {
		// TODO Auto-generated method stub
		return this.duracionEstimada;
	}

	@Override
	int tiempoUtilizado() {
		// TODO Auto-generated method stub
		return estado.tiempoUtilizado(this);
	}
	
	double avance() {
		//System.out.println(this.duracionEstimada + " " + this.inicio+ " "+ this.fin);
		System.out.println(tiempoUtilizado() + " "+ estimacionTotal());
		return tiempoUtilizado()/estimacionTotal();
	}

	@Override
	void iniciar() {
		this.estado.iniciar(this);
	}

	@Override
	void completar() {
		this.estado.completar(this);
	}
	
	public int finMenosInicio() {
		return this.fin - this.inicio;
	}
	
	public void cambiarEstado(EstadoTarea estado) {
		this.estado= estado;
	}
	
	public void setInicio(int inicio) {
		this.inicio= inicio;
	}
	
	public void setFin(int fin) {
		this.fin=fin;
	}

}
