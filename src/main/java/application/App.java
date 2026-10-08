package application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import application.entity.Students;
import application.service.StudentsService;
import application.utility.HibernateUtil;

public class App {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.connect();
		Session s = sf.openSession();
		StudentsService st=new StudentsService();
		Students stu = st.retrieve(2);
		System.out.println(stu.getName());
		Transaction t = s.beginTransaction();
//		s.persist(st.insert());
		t.commit();
		System.out.println("This is the Change in the Project");
	}

}
