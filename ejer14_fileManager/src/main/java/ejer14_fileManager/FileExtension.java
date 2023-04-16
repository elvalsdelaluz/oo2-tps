package ejer14_fileManager;

public class FileExtension extends FileDecorator {
	
	
	//CONSTRUCTOR
	public FileExtension(FileStructure file) {
		super(file);
	}

	//MÉTODOS
	public String prettyPrint() {
		return this.getExtension();
	}

}
