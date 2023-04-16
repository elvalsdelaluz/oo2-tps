package ejer14_fileManager;

public abstract class FileDecorator implements FileStructure {
	private FileStructure fileDecorate;
	
	//CONSTRUCTOR
	public FileDecorator(FileStructure file) {
		this.fileDecorate = file;
	}
	
	//MÉTODOS
	public String getName() {
		return this.fileDecorate.prettyPrint()+this.fileDecorate.getName();
	}

	public String getExtension() {
		return this.fileDecorate.prettyPrint()+this.fileDecorate.getExtension();
	}
	
	////////////////////////////////////////////////////////////
	protected FileStructure file() {
		return this.fileDecorate;
	}
	////////////////////////////////////////////////////////////
	
	public double getSize() {
		return this.fileDecorate.getSize();
	}
	
    

}
