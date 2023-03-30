package ejer4_topografias;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia{
	
	private List<Topografia> topografiaMixta;
	
	//Constructor 
	public Mixta (Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		this.topografiaMixta = new ArrayList<Topografia>();
		this.topografiaMixta.add(t1);
		this.topografiaMixta.add(t2);
		this.topografiaMixta.add(t3);
		this.topografiaMixta.add(t4);
	}
	
	//Métodos
	
	public double calcularProporcionAgua() {
		return (this.topografiaMixta.stream().mapToDouble(parcela -> parcela.calcularProporcionAgua()).sum())/4;
	}
	
	
	public double calcularProporcionTierra() {
		return(this.topografiaMixta.stream().mapToDouble(parcela -> parcela.calcularProporcionTierra()).sum())/4;
	}
	
	public List<Topografia> composicion(){
		return this.topografiaMixta;
	}
	 

	public boolean compararIgualdad(Topografia topo) {
		return super.compararIgualdad(topo) && this.equals(topo);
		
				
	}
	
	
	public boolean equals (Topografia topo) {
		return topo.compararContraMixta(this);
		
	}
	
	public boolean compararContraMixta(Mixta otro) {
		/*return this.topografiaMixta.get(0).equals(otro.topografiaMixta.get(0)) &&
				this.topografiaMixta.get(1).equals(otro.topografiaMixta.get(1)) &&
				this.topografiaMixta.get(2).equals(otro.topografiaMixta.get(2)) &&
				this.topografiaMixta.get(3).equals(otro.topografiaMixta.get(3));
		*/
		return this.topografiaMixta.equals(otro.topografiaMixta);
	}
	

}
