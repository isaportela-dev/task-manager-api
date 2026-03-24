package com.isabella.taskmanager.controller;

import com.isabella.taskmanager.model.Task;
import com.isabella.taskmanager.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@Tag(name = "Tasks", description = "Task management operations")
@CrossOrigin(origins = {
    "http://127.0.0.1:5500",
    "http://localhost:5500",
    "https://task-manager-api-three-opal.vercel.app/"
})
public class TaskController {

    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    @Operation(summary = "Get all tasks")
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get task by ID")
    public Task getTaskById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    @Operation(summary = "Create a new task")
    public Task createTask(@RequestBody Task task) {
        return repository.save(task);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update a task")
    public Task updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        Task task = repository.findById(id).orElse(null);

        if (task == null) {
            return null;
        }

        task.setTitle(updatedTask.getTitle());
        task.setDescription(updatedTask.getDescription());
        task.setStatus(updatedTask.getStatus());

        return repository.save(task);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a task")
    public void deleteTask(@PathVariable Long id) {
        repository.deleteById(id);
    }
}