package com.tuyano.springboot;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class MyDataDaoImpl implements MyDataDao<MyData> {

	private static final long serialVersionUID = 1L;

	private EntityManager entityManager;

	public MyDataDaoImpl() {
		super();
	}

	public MyDataDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<MyData> getAll() {
		Query query = entityManager.createQuery("from MyData");
		List<MyData> list = query.getResultList();
		entityManager.close();
		return list;
	}

	@Override
	public MyData findById(long id) {
		return (MyData) entityManager.createQuery("from MyData where id = " + id).getSingleResult();
	}

	@Override
	public List<MyData> findByName(String name) {
		return (List<MyData>) entityManager.createQuery("from MyData where name = " + name).getResultList();
	}

	@Override
	public List<MyData> find(String fstr) {
		List<MyData> list = null;
		Long fid = 0L;
		try {
			fid = Long.parseLong(fstr);
		} catch (NumberFormatException e) {
			// e.printStackTrace();
		}
		Query query = entityManager.createNamedQuery("findWithName").setParameter("fname", "%" + fstr + "%");
		list = query.getResultList();
		return list;
	}

	@Override
	public List<MyData> findByAge(int min, int max) {
		// TODO Auto-generated method stub
		return (List<MyData>)entityManager.createNamedQuery("findByAge").setParameter("min", min).setParameter("max", max).getResultList();
		
	}
}
