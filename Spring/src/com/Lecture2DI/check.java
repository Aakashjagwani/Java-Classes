package com.Lecture2DI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class check
{
	
	public static void main(String args[]) throws Exception
	{
		
	Resource r= new ClassPathResource("applicationContext.xml");
	BeanFactory br=	new XmlBeanFactory(r);
	One o1=(One) br.getBean("oo");
	o1.show();
	}	
}
