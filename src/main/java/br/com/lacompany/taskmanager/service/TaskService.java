package br.com.lacompany.taskmanager.service;

import br.com.lacompany.taskmanager.domain.Task;
import br.com.lacompany.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> findAll() {
        return (List<Task>) taskRepository.findAll();
    }
}

