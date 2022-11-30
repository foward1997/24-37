package HelloWorld;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World//Merhaba Java");
		
		int ogrenciSayisi =18;
		System.out.println("Öğrenci sayımız ="+ogrenciSayisi);

		double sayi=12.5;
		
		char Karakter='A';
		
		boolean dogruMu =false;
		
		
		System.out.println("İFLER");
		
		
		int sayi1=38;
		
		if(sayi1<36)
			System.out.println("Sayi1 36 dan küçüktür.");
		else if(sayi1==36)
			System.out.println("Sayi1 36 ya eşittir.");
		else {
			System.out.println("Sayi1 36 dan büyüktür.");
		}
		
		System.out.println("En büyük sayi");
		
		int sayi2=35;
		int sayi3=23;
		int sayi4=58;
		
		int enBuyukSayi=sayi2;
		
		if(enBuyukSayi<sayi3)
			enBuyukSayi=sayi3;
		if(enBuyukSayi<sayi4)
			sayi4=enBuyukSayi=sayi4;
		
		System.out.println("En büyük sayı ="+enBuyukSayi);
		
			
	}

}
