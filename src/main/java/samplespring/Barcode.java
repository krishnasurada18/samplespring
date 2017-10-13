package samplespring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Barcode")
public class Barcode {
     @Id
     @GeneratedValue
     @Column (name="id")
     private int id;
     
     @Column (name="value")
     private int value;
     
     @Column (name="type")
     private String type;
     
     @Column (name="group")
     private String group;
     
     @Column (name="name")
     private String name;
     
     @Column (name="description")
     private String description;
     
     @Column (name="productitem")
     private String productitem;
     
     @Column (name="batchnumber")
     private int batchnumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductitem() {
		return productitem;
	}

	public void setProductitem(String productitem) {
		this.productitem = productitem;
	}

	public int getBatchnumber() {
		return batchnumber;
	}

	public void setBatchnumber(int batchnumber) {
		this.batchnumber = batchnumber;
	}
     
     

}
