package com.isabella.taskmanager.controller;

import com.isabella.taskmanager.model.Task;
import com.isabella.taskmanager.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Task> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Task buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Task criar(@RequestBody Task task) {
        return repository.save(task);
    }

    @PutMapping("/{id}")
    public Task atualizar(@PathVariable Long id, @RequestBody Task taskAtualizada) {
        Task task = repository.findById(id).orElse(null);

        if (task == null) {
            return null;
        }

        task.setTitulo(taskAtualizada.getTitulo());
        task.setDescricao(taskAtualizada.getDescricao());
        task.setStatus(taskAtualizada.getStatus());

        return repository.save(task);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}