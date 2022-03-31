package com.practise.dao;

import javax.persistence.Cacheable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practise.entities.LoginData;

@Repository
@Cacheable
public interface LoginDataRepository extends CrudRepository<LoginData,Integer> {
	
	public LoginData findByUsername(String username);
	

}
