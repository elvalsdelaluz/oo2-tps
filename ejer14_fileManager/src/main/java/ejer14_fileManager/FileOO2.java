package ejer14_fileManager;

public class FileOO2 implements FileStructure{
	private String name;
	private String extension;
	private double size;
	
	//CONSTRUCTOR
	public FileOO2(String name, String extension, double size) {
		this.name = name;
		this.extension = extension;
		this.size = size;
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

	

}
