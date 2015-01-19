package com.webonise;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.classic.Session;


//import com.webonise.UserDetails;

public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		UserDetails userDetails=new UserDetails();
		userDetails.setId(3);
		userDetails.setName("Naveen Patil");
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.getTransaction().commit();

	}

}
