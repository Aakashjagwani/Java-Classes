package controller;



import org.hibernate.*;
import java.util.*;

import controller.regVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;


@Repository
public class regdao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void insert(regVo v)
	{
		try
		{
			Session session=sessionFactory.openSession();
			Transaction tr=session.beginTransaction();
			session.save(v);
			System.out.println("ho gya");
			tr.commit();
			session.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public List<?> search(regVo v,String s)
	{
		List<?> l =new ArrayList();
		try
		{
			
			Session session=sessionFactory.openSession();
			Transaction tr=session.beginTransaction();
			Query q= session.createQuery("from regVo v where v.fn='"+s+"'");
			l = q.list();
					System.out.println("ho gya");
			tr.commit();
			session.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return l;
	}
}