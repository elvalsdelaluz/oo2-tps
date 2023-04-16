package ejer14_fileManager;

public class FileName extends FileDecorator {
	
	
	//CONSTRUCTOR
	public FileName(FileStructure file) {
		super(file);
	}

	//MÉTODOS
	public String prettyPrint() {
		return this.getName();
	}

}
