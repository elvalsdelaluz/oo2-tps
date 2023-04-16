package ejer7_toDoItem;


public class Pause extends StatesItem{
	
	
	public void togglePause(ToDoItem item) {
		 item.setState(new InProgress());
	 }

	
}
