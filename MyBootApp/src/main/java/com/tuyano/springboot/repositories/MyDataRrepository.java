package com.tuyano.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuyano.springboot.MyData;

@Repository
public interface MyDataRrepository extends JpaRepository<MyData, Long> {
	public MyData findById(Long name);
	public List<MyData> findByNameLike(String name);
	public List<MyData> findByIdIsNotNullOrderByIdDesc();
	public List<MyData> findByAgeGreaterThan(Integer age);
	public List<MyData> findByAgeBetween(Integer age1, Integer age2);
}
