package br.com.lacompany.taskmanager.controller;

import br.com.lacompany.taskmanager.domain.Task;
import br.com.lacompany.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/findAllTasks")
    public ResponseEntity<List<Task>> findAllTasks() {
        List<Task> tasks = taskService.findAll();
        return ResponseEntity.ok(tasks);
    }

    @PostMapping("/createTask")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task newTask = taskService.createTask(task);
        return new ResponseEntity<>(newTask, HttpStatus.CREATED);
    }

}
