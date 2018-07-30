package DataAccessObject;

import ValueObject.vo;
import java.sql.*;
import java.util.*;

public class DAO {
	public void insert(vo v) throws ClassNotFoundException, SQLException{
		
		System.out.println("in the DAO");
		String s1=	v.getFn();
		String s2=	v.getLn();
		int i1=v.getId();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost/table","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("insert into MVC(fn,ln) values('"+s1+"','"+s2+"','"+i1+"')");
		s.close();
		c.close();		
	}
	public List<vo> search(vo v) throws ClassNotFoundException, SQLException
	{
		List<vo> ls=new ArrayList<vo>();
		String s1=	v.getFn();
		//String s2=	v.getLn();
		//int i1 =    v.getId();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost/table","root","root");
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("select * from MVC where(fn like '"+s1+"')");
		while(rs.next())
		{
			vo v1=new vo();
			String s3=rs.getString("fn");
			String s4=rs.getString("ln");
			int i2=rs.getInt(3);
			v1.setFn(s3);
			v1.setLn(s4);
			v1.setId(i2);
			ls.add(v1);
		}
		return ls;		
	}
	public void delete(vo v) throws ClassNotFoundException, SQLException{
		String s1=	v.getFn();
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost/table","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("DELETE From MVC where fn='"+s1+"' ");
		s.close();
		c.close();		
	}	
}
