package com.ironhack.taskmgmt.repository;

import com.ironhack.taskmgmt.model.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillableTaskRepository extends JpaRepository<BillableTask, Integer> {
}
