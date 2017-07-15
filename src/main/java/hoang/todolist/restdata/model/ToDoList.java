package hoang.todolist.restdata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDoList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
 
	private String firstDate;
 
	private String lastDate;
	
	public ToDoList(){
	}
	
	public ToDoList(String name, String firstDate, String lastDate){
		this.name = name;
		this.firstDate = firstDate;
		this.lastDate = lastDate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setFirstDate(String firstDate){
		this.firstDate = firstDate;
	}
	
	public String getFirstDate(){
		return this.firstDate;
	}
	
	public void setLastDate(String lastDate){
		this.lastDate = lastDate;
	}
	
	public String getLastDate(){
		return this.lastDate;
	}
}
