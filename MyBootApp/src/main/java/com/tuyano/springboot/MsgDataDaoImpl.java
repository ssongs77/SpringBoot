package com.tuyano.springboot;

import java.util.List;

import javax.persistence.EntityManager;

public class MsgDataDaoImpl implements MsgDataDao<MsgData> {

	private EntityManager entityManager;

	public MsgDataDaoImpl() {
		// TODO Auto-generated constructor stub
		super();
	}

	public MsgDataDaoImpl(EntityManager mamager) {
		entityManager = mamager;
	}

	@Override
	public List<MsgData> getAll() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from MsgData").getResultList();
	}

	@Override
	public MsgData findById(long id) {
		// TODO Auto-generated method stub
		return (MsgData)entityManager.createQuery("from MsgData where id = "+id).getSingleResult();
	}

}
