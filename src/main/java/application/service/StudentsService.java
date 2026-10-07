package application.service;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import application.dao.StudentsDao;
import application.entity.Students;
import application.utility.HibernateUtil;

public class StudentsService implements StudentsDao {
	
	Scanner s=new Scanner(System.in);
	
	@Override
	public Students insert() {
		Students stu=new Students();
		System.out.println("Enter your Name:");
		String name = s.next();
		stu.setName(name);
		System.out.println("Enter your AFID Code:");
		String code = s.next();
		stu.setAfidCode(code);
		return stu;
	}

	@Override
	public Students retrieve(int id) {
		SessionFactory sf = HibernateUtil.connect();
		Session s = sf.openSession();
		Students st = s.find(Students.class, id);
		return st;
	}

	@Override
	public void update() {
		
	}

	@Override
	public void delete() {
		
	}

}
