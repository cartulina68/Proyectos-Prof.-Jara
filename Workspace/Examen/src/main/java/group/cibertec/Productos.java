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
@Table (name = "productos")
public class Productos {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_prod;
	
	@Column(name = "nom_prod")
	String nom_prod;
	
	@Column(name = "precio")
	double precio;
	
	@Column(name = "stock_actual")
	int stock;
	
	public Productos() {}
}
