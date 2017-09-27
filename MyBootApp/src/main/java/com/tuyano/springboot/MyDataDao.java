package com.tuyano.springboot;

import java.io.Serializable;
import java.util.List;

public interface MyDataDao <T> extends Serializable {
	public List<T> getAll();
	
	public T findById(long id);
	public List<T> findByName(String name);
	public List<T> find(String str);
	public List<T> findByAge(int min, int max);
	
}
