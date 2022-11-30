package Methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca(6);

	}
	
	
	public static void sayiBulmaca(int aranacak) {
		
		int[] sayilar= {1,3,5,7,8,9,11};
		
		int adet=0;
		
		for(int i=0;i<sayilar.length;i++) {
			if(aranacak==sayilar[i])
				adet++;
			
		}
		
		if(adet>0)
			mesajVer("Sayi mevcuttur.");
		else {
			mesajVer("Sayi mevcut değildir.");
		}
		
	}
	
	public static void mesajVer(String mesaj) {
		
		System.out.println(mesaj);
		
		
		
	}

}
