package com.example.demo;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student")
@Data
public class student implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "gender")
    private String gender;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
