package com.avla.todo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.avla.todo.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Serializable>{
	
}
