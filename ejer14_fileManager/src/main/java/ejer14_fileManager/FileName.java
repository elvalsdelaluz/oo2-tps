package ejer14_fileManager;

public class FileName extends FileDecorator {
	
	
	//CONSTRUCTOR
	public FileName(FileStructure file) {
		super(file);
	}

	@Override
	public String hook() {
		return this.getName();
	}

	//MÉTODOS
//	public String prettyPrint() {
//		return this.getName();
//	}

	
	
}
