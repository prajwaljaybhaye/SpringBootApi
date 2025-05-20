package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entityt.Entity;

public interface Repo  extends JpaRepository< Entity, Integer>{

}
