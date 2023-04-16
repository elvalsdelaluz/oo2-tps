package ejer14_fileManager;

public class FileSize extends FileDecorator {

	public FileSize(FileStructure file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return file().prettyPrint()+getSize();
	}
	
	
	

}
