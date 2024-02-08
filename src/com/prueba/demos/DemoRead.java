package com.prueba.demos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.proyecto.entidades.Usuario;

public class DemoRead {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Usuario.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			
			/* 
			 * Forma en que se puede extraer un objeto por medio del id
			 * parametros(Clase a la cual hace referencia, registro que se trae por medio del id)
			 */
			Usuario usuarioResultado = session.get(Usuario.class, 2); 
			System.out.println("Registro optenido: " + usuarioResultado);
			/*
			 * Otra forma seria obtener el resultado a partir de la ejecucion de una sentencia HQL
			 * como la consulta puede devolver varios datos, se especifica no un objeto sino un conjunto de objetos.
			 * por ello se utiliza una lista de objetos de tipo Usuario
			 * 
			 * En este caso esta lista de usuarios es producto de una consulta a traves de la sesion por medio del metodo createQuery
			 */
			List<Usuario> usuarios = session.createQuery("from Usuario").list(); // como es HQL se especifica Usuario y no usuario porque se especifica la entidad 
			System.out.println("\nConsulta general");
			for (Usuario usuario : usuarios) {
				System.out.println(usuario);
			}
			
			session.getTransaction().commit();
			System.out.println("Proceso finalizado");
		} finally {
			factory.close();
		}
		
	}
}
