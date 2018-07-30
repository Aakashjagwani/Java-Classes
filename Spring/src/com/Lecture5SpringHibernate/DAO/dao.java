package com.Lecture5SpringHibernate.DAO;

import java.util.*;


import org.hibernate.*;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.Lecture5SpringHibernate.regVo;


@Repository
public class dao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void insert(regVo v)
	{
		try{		
			
		Session session = sessionFactory.openSession();

		Transaction t = session.beginTransaction();
		session.save(v);
		System.out.println("Successfully");
		t.commit();
		session.close();
		sessionFactory.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public List<?> search(regVo v)
	{
		List<?> l=new ArrayList<>();

		try{
		
		Session session = sessionFactory.openSession();
		    int i=v.getId();
		    Transaction t = session.beginTransaction();
		    String s1="From regVo v where v.id='"+i+"' ";
		    Query q=session.createQuery(s1);
		    l=q.list();
		    System.out.println("Successfully");
		    t.commit();
		    session.close();
		    sessionFactory.close();
		    return l;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
	}
}
