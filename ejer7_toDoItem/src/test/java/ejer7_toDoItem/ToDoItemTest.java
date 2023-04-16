package ejer7_toDoItem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoItemTest {
	private ToDoItem item;

	@BeforeEach
	void setUp() throws Exception {
		this.item = new ToDoItem("Matematica 3");
	}

	@Test
	void testExceptionTogglePause() {
		    try {
		    	this.item.togglePause();
		    } catch (Exception e) {
		    	 assertEquals("El objeto ToDoItem no se encuentra en pause o in-progress", e.getMessage()); 
		    }
	}
	
	@Test
    void testComments() {
    	this.item.addComment("Estoy en pending");
    	this.item.start();
    	this.item.addComment("Estoy en in-progress");
    	this.item.finish();
    	this.item.addComment("Esto no se va a agregar");
    	assertNotEquals("Esto no se va a agregar", this.item.commestsItem().get(this.item.commestsItem().size()-1));
    	System.out.println(this.item.commestsItem().get(this.item.commestsItem().size()-1));
    	
    }

}
