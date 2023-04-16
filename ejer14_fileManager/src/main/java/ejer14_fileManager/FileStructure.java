package ejer14_fileManager;

import java.time.LocalDate;

public interface FileStructure {
	String prettyPrint();
	String getName();
	String getExtension();
	double getSize();
	LocalDate getFechaCreacion();
	LocalDate getFechaModificacion();

}
