package group.cibertec;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RegistroApellido {
	EntityManagerFactory factory;
	EntityManager em;
	Factura fac;
	
	public void registrarFactura(Factura data) throws Exception{
		factory = Persistence.createEntityManagerFactory("Examen");
		em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(data);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		System.out.println("Factura registrado correctamente");
	}

	
	
public static void main(String[] args) {
		
	
	RegistroApellido a = new RegistroApellido();
	
	try {
		/* INI: REGISTRAR FACTURA **************/
		
		Factura fac = new Factura();
		fac.setFecha(fac.getFecha());
		fac.setIestado("Cancelado");
		fac.setD_cliente(1);
		fac.setTotal(12);
		
		a.registrarFactura(fac);
		
		/* FIN: REGISTRAR FACTURA **************/
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	

		/*Factura objFac = new Factura();
		
		//Demostramos el uso de getter y setter con lombok
		objFac.setFecha(null);
		objFac.setIestado("Cancelado");
		objFac.setD_cliente(1);
		objFac.setTotal(40.5);
		
		System.out.println("Factura registrada");
		
		
		
		
		System.out.println(objFac.getFecha());
		System.out.println(objFac.getIestado());
		System.out.println(objFac.getFecha());
		System.out.println(objFac.getD_cliente());
		System.out.println(objFac.getTotal());
		*/
	}

}
