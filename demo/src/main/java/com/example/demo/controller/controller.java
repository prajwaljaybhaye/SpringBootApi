package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.Dao;
import com.example.demo.entityt.Entity;


@RestController
public class controller {
	
@Autowired
Dao dao;

  @PostMapping("SaveData")
  public Entity SaveData( Entity entity) {
      dao.SaveData(entity) ;
      return entity;
  }//localhost:8080/SaveData
  
}
