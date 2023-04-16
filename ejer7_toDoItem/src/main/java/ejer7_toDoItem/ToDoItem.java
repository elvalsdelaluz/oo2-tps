package ejer7_toDoItem;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private List<String> comments;
	private String name;
	private StatesItem state;
	private Duration durationItem;
	
	//Constructor
	public ToDoItem (String name) {
		this.comments = new ArrayList<String>();
		this.name = name;
		this.state = new Pending();
	}
	
	//Metodos
	public List<String> commestsItem(){
		return this.comments;
	}
	
	public void setState (StatesItem state) {
		this.state = state;
	}
	
	/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
	        public void start() {
	        	this.state.start(this);
	        	
	        }

		/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
	        public void togglePause() {
	        	try {
	        	    this.state.togglePause(this);
	        	}catch (Exception ex){
	        		System.out.println(ex.getMessage());
	        	}
	        	
	        }


		/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
	        public void finish() {
	        	this.state.finish(this);
	        }


		/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
    * genera un error informando la causa específica del mismo.
*/
//        public Duration workedTime() {
//        	
//        	return ;
//        }


/**
* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
* contrario no hace nada."
*/
	    public void addComment(String comment) {
        	this.state.addComment(this.comments, comment);
        }


}
