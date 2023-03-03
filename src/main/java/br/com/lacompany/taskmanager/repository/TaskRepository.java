package br.com.lacompany.taskmanager.repository;

import br.com.lacompany.taskmanager.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

}

