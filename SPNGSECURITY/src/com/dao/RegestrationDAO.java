package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.RegestrationVO;

@Repository
public class RegestrationDAO 
{
	@Autowired SessionFactory sf;
	public void insert(RegestrationVO regvo)
	{
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.save(regvo);
		tr.commit();
		ss.close();
	}
	public List search()
	{
		List ls = new ArrayList();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Query q = ss.createQuery("from RegestrationVO");
		ls = q.list();
		ss.close();
		return ls;
	}
	public List search1(RegestrationVO regvo)
	{
		List ls = new ArrayList();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Query q = ss.createQuery("from RegestrationVO where id= '"+regvo.getId()+"'");
		ls = q.list();
		ss.close();
		return ls;

	}
	public void delete(RegestrationVO regvo)
	{
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.delete(regvo);
		tr.commit();
		ss.close();
	
	}

}
