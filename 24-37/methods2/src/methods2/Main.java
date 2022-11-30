package methods2;

public class Main {

	public static void main(String[] args) {
		
		yazıYaz("Teşekkür ederim");
		
		System.out.println(Topla(5,7));
		System.out.println(Topla2(5,7,9,81));
		
		}
	
	public static int Topla2(int... sayilar) {
		int toplam=0;
		
		for(int sayi : sayilar) {
			toplam=toplam+sayi;
			
		}
		return toplam;
		
		
	}
	
	public static int Topla(int sayi1,int sayi2) {
		
		return sayi1+sayi2;
	}
	
	public static void Ekle() {
		
		System.out.println("Eklendi");
		
	}
	
	public static void Sil() {
		
		System.out.println("Silindi");
		
	}

	public static void Güncelle() {
	
		System.out.println("Güncellendi");
	
	}
	
	public static void yazıYaz(String mesaj) {
		 System.out.println(mesaj);
	}


}
