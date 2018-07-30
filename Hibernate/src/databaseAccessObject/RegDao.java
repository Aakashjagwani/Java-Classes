package databaseAccessObject;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import valueObject.Vob;

public class RegDao {
	public void insert(Vob v)
	{
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		    
		    Transaction t = session.beginTransaction();
		    session.save(v);
		    System.out.println("Successfully");
		    t.commit();
		    session.close();
		    factory.close();
	}
	public void delete(Vob v)
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
	public List<?> search(Vob v)
	{
		List<?> l=new ArrayList<>();
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		    int i=v.getId();
		    Transaction t = session.beginTransaction();
		    String s1="From Vob where ID='"+i+"' ";
		    Query q=session.createQuery(s1);
		    l=q.list();
		    System.out.println("Successfully");
		    t.commit();
		    session.close();
		    factory.close();
		    return l;
	}
	public List<?> edit(Vob v)
	{
		List<?> l=new ArrayList<>();
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		Transaction t = s.beginTransaction();
		int i=v.getId();
		String s3="From Vob where ID='"+i+"' ";
	    Query q=s.createQuery(s3);
	    l=q.list();
	    t.commit();
		s.close();
		factory.close();
		return l;	
	}
	public void update(Vob v)
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
