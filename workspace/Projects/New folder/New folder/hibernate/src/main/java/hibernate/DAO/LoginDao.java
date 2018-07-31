package hibernate.DAO;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.VO.LoginVo;

public class LoginDao {
	
	
public void insert(LoginVo v) {
		SessionFactory s = new Configuration().configure().buildSessionFactory();
		System.out.println("done");
		Session session1 =s.openSession();
		Transaction tr = session1.beginTransaction();
		session1.persist(v);
		System.out.println("done");
		tr.commit();
	}
public void search(LoginVo v){
	
	    System.out.println("Hello World");  
		SessionFactory s = new Configuration().configure().buildSessionFactory();
		Session session1 =s.openSession();
		session1.beginTransaction();
	    v  = (LoginVo) session1.get(LoginVo.class, 1); 
	    session1.save(v);
	    System.out.println(v.getFirstname());	
}


}
