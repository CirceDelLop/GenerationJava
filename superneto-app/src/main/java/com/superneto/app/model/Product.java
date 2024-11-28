package com.superneto.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**@Entity se usa para marcar una clase como una entidad que se puede persistir en una base de datos relacional.
 * Se indica a JPA que la clase representa una tabla en la base de datos y que los objetos de esta clase puedan ser almacenados, actualizados o eliminados en  dicha tabla. Además, cada instancia se la clase se considera una fila en la tabla.*/
@Entity
@Table (name="products")
public class Product {
	@Id //Indica que el atributo será la clave primaria
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Indica como se generarán automaticamente las llaves primarias
	  private Long id;
	  private String name;
	  private Double price;
	
	  protected Product() {}
	
	  public Product(String name, Double price) {
	    this.name = name;
	    this.price = price;
	  }
	  
	  public Long getId() {
		return id;
	  }
	
		public void setId(Long id) {
			this.id = id;
		}
	
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public Double getPrice() {
			return price;
		}
		
		public void setPrice(Double price) {
			this.price = price;
		}
	
	@Override
	  public String toString() {
	    return String.format(
	        "Product[id=%d, name='%s', price='%f']",
	        id, name, price);
	  }  
}
