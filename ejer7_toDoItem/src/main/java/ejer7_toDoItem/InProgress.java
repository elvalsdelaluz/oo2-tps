package ejer7_toDoItem;


public class InProgress extends StatesItem{

	
	 public void togglePause(ToDoItem item) {
		 item.setState(new Pause());
	 }
	 

}
