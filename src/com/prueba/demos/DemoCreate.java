package com.prueba.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.proyecto.entidades.Usuario;	// se crea al instancias Usuario.class en addAnnotatedClass

public class DemoCreate {

	public static void main(String[] args) {
		/*	lo primero que se hace es crear el session factory
		es importante entender que se importa de hibernate */
		SessionFactory factory = new Configuration() 
				.configure("hibernate.cfg.xml") // se indica el archivo de configuracion de hibernate
				.addAnnotatedClass(Usuario.class) // se enlaza con la respectiva entidad clase de entidad con la cual va a hacer el mapeo
				.buildSessionFactory(); // metodo para construir el SessionFactory
		
		/* con la fabrica (factory) ya se puede crear la sesion
		 * realizará las consultas SQL y todas las operaciones directamente utilizando el jdbc
		 */
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction(); // iniciar una transaccion
			// se instancia un objeto de tipo Usuario y se ingresan los datos segun el constructor para asi aplicar el metodo Save para hacer la insersion
			Usuario usuario = new Usuario("fulano@gmail.com", "fulano");
			// mediante session se invoca el metodo Save y como parametro el objeto entity que viene con toda la informacion requerida
			session.save(usuario); // se envia a la db
			session.getTransaction().commit();	// confirme los cambios, lo hace por medio de commit
			
			System.out.println("Registro exitoso");
			
		} finally { // es necesario que al final de toda la operacion se cierre
			factory.close();
		}
	}
}