package application.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import application.entity.Students;

public class HibernateUtil {
	
	static SessionFactory sf;
	
	public static SessionFactory connect() {
		Configuration c=new Configuration();
		
		c.configure().addAnnotatedClass(Students.class);
		
		sf = c.buildSessionFactory();
		
		return sf;
	}
	
	

}
