package databaseAccessObject;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import valueObject.country_vo;
import valueObject.state_vo;

public class countryDAO {

	public void insert(country_vo v) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		session.save(v);
		System.out.println("Successfully");
		t.commit();
		session.close();
		factory.close();
	}

	public List<?> get_country(country_vo v) {
		List<?> l = new ArrayList<>();
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		String s2 = "From country_vo ";
		Query q = session.createQuery(s2);
		l = q.list();
		System.out.println("Successfully");
		t.commit();
		session.close();
		factory.close();
		return l;
	}

	public void insert1(state_vo v) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		session.save(v);
		System.out.println("Successfully");
		t.commit();
		session.close();
		factory.close();
	}

	public List<?> search_state(state_vo v) {
		List<?> l = new ArrayList<>();
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		String s1 = "From state_vo";
		Query q = session.createQuery(s1);
		l = q.list();
		System.out.println("Searched Successfully");
		t.commit();
		// session.close();
		// factory.close();
		return l;
	}

	public List<?> get_state(state_vo v) {
		List<?> l = new ArrayList<>();
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		String s2 = "From state_vo ";
		Query q = session.createQuery(s2);
		l = q.list();
		System.out.println("Successfully");
		t.commit();
		session.close();
		factory.close();
		return l;
	}

	public List<?> search_state2(country_vo v) {
		List<?> l = new ArrayList<>();
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		String s1 = "From state_vo where v='" + v.getId() + "'";
		Query q = session.createQuery(s1);
		l = q.list();
		System.out.println("Searched Successfully");
		t.commit();
		// session.close();
		// factory.close();
		return l;
	}
}