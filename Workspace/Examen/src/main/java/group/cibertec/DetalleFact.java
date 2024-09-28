package group.cibertec;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity 
@Table (name = "detallefact")
public class DetalleFact {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int nro_factura;
	
	@Column(name = "id_prod")
	int id_prod;
	
	@Column(name = "cantidad")
	int cantidad;
	
	public DetalleFact() {}

}
