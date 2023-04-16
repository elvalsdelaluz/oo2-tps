package ejer14_fileManager;

public class FileSize extends FileDecorator {

	public FileSize(FileStructure file) {
		super(file);
	}

    //MÉTODOS
	public String hook() {
		return String.valueOf(this.getSize());
	}
	
//	public String prettyPrint() {
//	return file().prettyPrint()+getSize();
//}

	

}
