package group.cibertec;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class ListadoApellido {
	EntityManagerFactory factory;
	EntityManager em;
	Factura es;
	
	public void buscarTodos() throws Exception{
		factory = Persistence.createEntityManagerFactory("Examen");
		em = factory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Factura> q = em.createQuery("select f from Factura f", Factura.class);
		
		java.util.List<Factura> res = q.getResultList();
		
		for(Factura item : res) {
			System.out.println("Nro Factura: " + String.valueOf(item.getNro_factura()) + " , Fecha: " + item.getFecha()
							+ " , Producto: " + String.valueOf(item.getD_cliente() + " , Total: " + item.getTotal()));
		}
		
		em.getTransaction();
		em.close();
	}
	
public static void main(String[] args) {
		
		ListadoApellido p = new ListadoApellido();
		try {
			/* INI: BUSCAR TODOS LOS FACTURAS *********/
			System.out.println("--------LISTA DE TODAS LAS FACTURAS---------");
			p.buscarTodos(); 
			System.out.println("\n");
			/* FIN: BUSCAR TODOS LOS FACTURAS *********/
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
