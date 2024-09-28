package group.cibertec;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity 
@Table (name = "factura")
@NamedQuery(name="factura.findAll", query="SELECT f FROM factura f")
public class Factura {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int nro_factura;
	
	@Column(name = "fecha")
	LocalDateTime fecha;
	
	@Column(name = "iestado")
	String iestado;
	
	@Column(name = "d_cliente")
	int d_cliente;
	
	@Column(name = "total")
	double total;
	
	@Column(name = "producto")
	double producto;
	
	public Factura() {}
}
