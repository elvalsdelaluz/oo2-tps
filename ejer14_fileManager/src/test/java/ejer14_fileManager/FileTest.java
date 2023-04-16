package ejer14_fileManager;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileTest {
	private FileStructure capa1;
	private FileStructure capa2;
	private FileStructure capa3;
	private FileStructure capa4;
	private FileStructure capa5;
	private FileStructure capa6;
	

	@BeforeEach
	void setUp() throws Exception {
		this.capa1 = new FileOO2("ejer14_fileManager", ".jar", 14.5, LocalDate.now(), LocalDate.now());
		this.capa2 = new FileName(capa1);
		this.capa3 = new FileExtension(capa2);
		this.capa4 = new FileSize(capa3);
		this.capa5 = new FileName(capa4);
		this.capa6 = new FileDateModify(capa5);
	}

	@Test
	void testCapas() {
		assertEquals("", capa1.prettyPrint());
		System.out.println(capa1.prettyPrint());
		System.out.println(this.capa2.prettyPrint());
		System.out.println(this.capa3.prettyPrint());
		System.out.println(this.capa4.prettyPrint());
		System.out.println(this.capa6.prettyPrint());
	}

}
