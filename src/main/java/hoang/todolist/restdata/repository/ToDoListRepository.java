package hoang.todolist.restdata.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import hoang.todolist.restdata.model.ToDoList;

@RepositoryRestResource(collectionResourceRel = "todolist", path = "todolist")
public interface ToDoListRepository extends PagingAndSortingRepository<ToDoList,Long> {
	List<ToDoList> findByName(@Param("name") String name);
}
