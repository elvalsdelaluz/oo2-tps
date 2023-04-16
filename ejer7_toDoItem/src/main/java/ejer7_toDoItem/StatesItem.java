package ejer7_toDoItem;

import java.util.List;

public abstract class StatesItem {

	public void start(ToDoItem toDoItem) {
		//No hace nada
	}

	public void togglePause(ToDoItem item) throws Exception {
		//En el caso de que la tarea se encuentre en el estado finishied o pending se ejecuta la siguien excepcion: 
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}


	 public void finish (ToDoItem item) {
		 item.setState(new Finishied()); 
	 }

	public void addComment(List<String> comments, String comment) {
		 comments.add(comment);
	};

}
