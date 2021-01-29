package com.ironhack.taskmgmt.repository;

import com.ironhack.taskmgmt.model.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalTaskRepository extends JpaRepository<InternalTask, Integer> {
}
