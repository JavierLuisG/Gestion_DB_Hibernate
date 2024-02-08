package com.prueba.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.proyecto.entidades.Usuario;

public class DemoUpdate {

	public static void main(String[] args) {
		// fabrica
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Usuario.class)
				.buildSessionFactory();
		// Sesion
		Session session = factory.getCurrentSession();
		
		try {
			// iniciar la transaccion
			session.beginTransaction();
			
			/* 
			 * la actualizacion se hace por medio de un objeto persistente
			 * Un objeto persistente se puede obtener cuando hay una conexion con un registro de hibernate 
			 * se puede lograr haciendo una consulta a la db
			 */
			Usuario persistencia = session.get(Usuario.class, 4); // el registro indicado es el que se actualizará
			persistencia.setUserPassword("fulano"); // Como es un objeto en estado persistente(observado por hibernate) y se da cuenta de una actualizacion, entonces se refleja en la db
			
			/*
			 * La otra forma con HQL es
			 * Donde se ejecuta la actualizacion al final 
			 * Importante userPassword es como está en la variable de Usuario, no como en la db
			 */
			session.createQuery("UPDATE Usuario SET userPassword = 'sutano' WHERE userid = 3").executeUpdate();
			
			// confirmar la transaccion
			session.getTransaction().commit();
			System.out.println("Proceso finalizado");
		} finally {
			// cerrar la fabrica
			factory.close();
		}
	}

}
