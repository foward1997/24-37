package OOP1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();

		product1.setName("Asus Laptop");
		product1.setDescription("İşe yaramaz bilgisayar"); 
		product1.setDiscount(27.5);
		product1.setImageUrls("Asus.jpg");
		product1.setStock(37); 
		product1.setUnitPrice(2500); 

		Product product2 = new Product();

		product2.setName("MSI Laptop");
		product2.setDescription("Oyun bilgisayarı");
		product2.setDiscount(25);
		product2.setImageUrls("MSİ.jpg");
		product2.setStock(32);
		product2.setUnitPrice(8200);

		Product product3 = new Product();

		product3.setName("HP Laptop");
		product3.setDiscount(40);
		product3.setDescription("İş bilgisayarı");
		product3.setImageUrls("HP.jpg");
		product3.setStock(36);
		product3.setUnitPrice(4150);
		
		
		Product[] products= {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}

	
	Indivual indivual=new Indivual();
	indivual.setPhone("5053681678");
	indivual.setFirstName("Aydın");
	indivual.setLastName("Turani");
	indivual.setId(1);
	indivual.setCustomerNumber("358");
	
	Corporate corporate =new Corporate();
	corporate.setCompanyName("EA GAMES");
	corporate.setCustomerNumber("359");
	corporate.setId(2);
	corporate.setPhone("5348943213");
	corporate.setTaxNumber("358432");
	
	Customer[] customers= {indivual,corporate};
	}

}
