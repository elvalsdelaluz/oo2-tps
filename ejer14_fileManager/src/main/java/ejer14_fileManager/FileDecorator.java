package ejer14_fileManager;

import java.time.LocalDate;

public abstract class FileDecorator implements FileStructure {
	private FileStructure fileDecorate;
	
	//CONSTRUCTOR
	public FileDecorator(FileStructure file) {
		this.fileDecorate = file;
	}
	
	//MÉTODOS
	public String getName() {
		return this.fileDecorate.getName();
	}

	public String getExtension() {
		return this.fileDecorate.getExtension();
	}
//	
//	////////////////////////////////////////////////////////////
//	protected FileStructure file() {
//		return this.fileDecorate;
//	}
//	////////////////////////////////////////////////////////////
	
	public double getSize() {
		return this.fileDecorate.getSize();
	}
	
	public LocalDate getFechaCreacion() {
		return this.fileDecorate.getFechaCreacion();
	}

	public LocalDate getFechaModificacion() {
		return this.fileDecorate.getFechaModificacion();
	}
	
	//TEMPLATE METHOD
	public abstract String hook();

	public String prettyPrint() {
		return fileDecorate.prettyPrint()+ " " + hook();
	}
	
	
	
    

}
