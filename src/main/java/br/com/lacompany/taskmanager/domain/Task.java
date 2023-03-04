package br.com.lacompany.taskmanager.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "collaborator")
    private String collaborator;
    @Column(name = "sector")
    private String sector;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;

    @Column(name = "startDate")
    private LocalDate startDate;

    @Column(name = "finish")
    private LocalDate finish;

    @Column(name = "status")
    private String status;


    public Task() {
    }

    public Task(String sector, String title, String description, String collaborator) {
        this.sector = sector;
        this.title = title;
        this.description = description;
        this.collaborator = collaborator;

    }
}
