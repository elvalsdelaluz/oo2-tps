package ejer14_fileManager;

public class FileDateModify extends FileDecorator {
	

	    //CONSTRUCTOR
		public FileDateModify(FileStructure file) {
			super(file);
		}

		//MÉTODOS
		public String hook() {
			return this.getFechaModificacion().toString();
		}

}
