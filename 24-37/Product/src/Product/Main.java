package Product;

public class Main {

	public static void main(String[] args) {
		Product product=new Product();
		ProductManager productManager=new ProductManager();
		product.setName("HPX9822718");
		product.setId(5);
		product.setDescription("Is bilgisayari");
		product.setPrice(4500);
		product.setStock(3);
		
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
