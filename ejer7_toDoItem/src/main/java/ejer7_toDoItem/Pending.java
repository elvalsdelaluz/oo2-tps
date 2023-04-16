package ejer7_toDoItem;


public class Pending extends StatesItem{
	
	//Metodos
	public void start (ToDoItem talk ) {
	     talk.setState(new InProgress());	
	}
	
	public void finish(ToDoItem toDoItem) {
		// No hace nada	
	}
	
	

}
