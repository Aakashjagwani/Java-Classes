package hiber.DAO;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hiber.VO.Regist;

@SuppressWarnings("deprecation")
public class RegDao {
	public void insert(Regist v)
	{
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		    
		    Transaction t = session.beginTransaction();
		    session.save(v);
		    System.out.println("Successfully");
		    t.commit();
		    session.close();
		    
		    v = null;
		    session = factory.openSession();
		    session.beginTransaction();
		    v =(Regist) session.get(Regist.class,1);
		    System.out.println(v.getFn()+v.getLn()+v.getUn());
	}
	public void delete(Regist v)
	{		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		    
		    Transaction t = session.beginTransaction();
		    session.delete(v);
		    System.out.println("Successfully");
		    t.commit();
		    session.close();
		    factory.close();
	}	
	public List<?> search(Regist v)
	{
		List<?> l=new ArrayList<Object>();
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		    int i=v.getId();
		    Transaction t = session.beginTransaction();
		    String s1="From Regist where ID='"+i+"' ";
		    Query<?> q=session.createQuery(s1);
		    l=q.list();
		    System.out.println("Successfully");
		    t.commit();
		    session.close();
		    factory.close();
		    return l;
	}
	public List<?> edit(Regist v)
	{
		List<?> l=new ArrayList<Object>();
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		Transaction t = s.beginTransaction();
		int i=v.getId();
		String s3="From Regist where ID='"+i+"' ";
	    Query<?> q=s.createQuery(s3);
	    l=q.list();
	    t.commit();
		s.close();
		factory.close();
		return l;	
	}
	public void update(Regist v)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		Transaction t = s.beginTransaction();
		s.update(v);
	    System.out.println("Updated Successfully");
		t.commit();
		s.close();
		factory.close();
	}	
}
