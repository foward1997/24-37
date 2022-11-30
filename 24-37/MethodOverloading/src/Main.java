
public class Main {

	
	public static int toplama(int sayi1,int sayi2) {
		
		return sayi1+sayi2;
		
		
	}
	public static int toplama(int sayi1,int sayi2,int sayi3) {
		
		return sayi1+sayi2+sayi3;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		toplama(4,5);
		toplama(5, 6,7);
		
		
		System.out.println(toplama(5, 6,7)+"   "+toplama(4,5));

	}

}
