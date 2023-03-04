package br.com.lacompany.taskmanager.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@NoArgsConstructor
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;

    @Column(name = "dueDate")
    private LocalDate dueDate;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

}
