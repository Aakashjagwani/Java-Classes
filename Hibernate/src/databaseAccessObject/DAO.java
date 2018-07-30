package databaseAccessObject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import valueObject.Regist;
import valueObject.User;

public class DAO {
	public void insert(Regist v)
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
	public void insert1(User vo)
	{
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		    
		    Transaction t = session.beginTransaction();
		    session.save(vo);
		    System.out.println("Successfully");
		    t.commit();
		    session.close();
		    factory.close();
	}
	
}
