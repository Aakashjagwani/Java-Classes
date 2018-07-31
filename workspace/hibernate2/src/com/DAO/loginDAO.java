package com.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class loginDAO {
	public void login(com.vo.login v) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(v);
		System.out.println("done");
		tr.commit();
	}

}






























