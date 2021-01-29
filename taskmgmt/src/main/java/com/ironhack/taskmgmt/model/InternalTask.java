package com.ironhack.taskmgmt.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "task_id")
public class InternalTask extends Task{

    public InternalTask() {
    }

    public InternalTask(String title, LocalDate dueDate, boolean status) {
        super(title, dueDate, status);
    }

}
