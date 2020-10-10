package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


public interface StuDao extends JpaRepository<student, Integer> ,
        JpaSpecificationExecutor<student> {
    public student findById(int id);

}
