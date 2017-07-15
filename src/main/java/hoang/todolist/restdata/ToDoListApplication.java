package hoang.todolist.restdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hoang.todolist.restdata.model.ToDoList;
import hoang.todolist.restdata.repository.ToDoListRepository;

@SpringBootApplication
public class ToDoListApplication implements CommandLineRunner{
	
	@Autowired
	ToDoListRepository toDoListRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
	}
}
