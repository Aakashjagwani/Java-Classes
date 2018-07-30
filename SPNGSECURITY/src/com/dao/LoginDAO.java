package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.LoginVO;

@Repository
public class LoginDAO 
{
	@Autowired SessionFactory sessionFactory;
	
	public void insert(LoginVO loginVO) 
		{
			try
				{
					Session session=sessionFactory.openSession();
					Transaction transaction=session.beginTransaction();
					session.save(loginVO);
					transaction.commit();
					session.close();
				}
			catch(Exception ex)
				{
					ex.printStackTrace();
				}
			
		}
	
	public List getLoginId(LoginVO loginVO)
		{
			List ls = new ArrayList();
			try
				{
					Session session=sessionFactory.openSession();
					Query query=session.createQuery("from LoginVO where loginUsername='"+loginVO.getLoginUsername()+"'");
					ls=query.list();
				}
			catch(Exception ex)
				{
					ex.printStackTrace();
				}
			return ls;
		}

	}
