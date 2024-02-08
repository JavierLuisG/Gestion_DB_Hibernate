package com.prueba.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.proyecto.entidades.Usuario;

public class DemoDelete {

	public static void main(String[] args) {
		
		// fabrica
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Usuario.class)
				.buildSessionFactory();
		
		// iniciar sesion
		Session session = factory.getCurrentSession();
		
		try {
			// comenzar la transaccion 
			session.beginTransaction();
			
			// se puede realizar tambien con persistencia (asi como en DemoUpdate) 
			Usuario persistencia = session.get(Usuario.class, 2);
			// el delete se realiza sobre la session
			session.delete(persistencia);
			
			session.createQuery("DELETE FROM Usuario WHERE userID = 4").executeUpdate(); // executeUpdate se ejecuta solo que en esta se realiza una query Delete
			
			session.getTransaction().commit();
			System.out.println("Operación exitosa");
			
		} finally {
			// cerrar la fabrica
			factory.close();
		}

	}

}
