package com.example.demo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entityt.Entity;
import com.example.demo.repo.Repo;

@Repository
public class Dao {
	
	@Autowired
	Repo repo;

	public Entity SaveData(Entity entity) {
		return repo.save(entity);
		
	}

}
