package ejer14_fileManager;

import java.time.LocalDate;

public class FileOO2 implements FileStructure{
	private String name;
	private String extension;
	private double size;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	
	//CONSTRUCTOR
	public FileOO2(String name, String extension, double size, LocalDate fC, LocalDate fM) {
		this.name = name;
		this.extension = extension;
		this.size = size;
		this.fechaCreacion = fC;
		this.fechaModificacion = fM;
	}
	
	//MÉTODOS
	public String prettyPrint() {
		return "";
	}

	public String getName() {
		return name;
	}

	public String getExtension() {
		return extension;
	}
	
	public double getSize() {
		return this.size;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	

}
