package ejer14_fileManager;

public class FileDateCreate extends FileDecorator {
	
	    //CONSTRUCTOR
		public FileDateCreate(FileStructure file) {
			super(file);
		}

		//MÉTODOS
		public String hook() {
			return this.getFechaCreacion().toString();
		}

}
