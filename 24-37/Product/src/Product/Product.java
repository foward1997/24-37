package Product;

public class Product {

	
public Product(String name,int stock,int id,int price,String colour,String description) {
	
	this.name=name;
	this.stock=stock;
	this.id=id;
	this.price=price;
	this.colour=colour;
	this.description=description;
	
	}
public Product() {
	
	
	
	
}
	
	


	
	
	
	
private	 int stock;
private	 int id;
private	 String name;
private	 int price;
private	 String description;
private	 String colour;
private	 String kod;


public int getId() {
	
	return id;
}

public void setId(int id) {
	
	this.id=id;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public   String getKod() {
	return this.name.substring(0,1)+id;
}


public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public int getStock() {
	return stock;
}

public void setStock(int stock) {
	this.stock = stock;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}
	
	
}
