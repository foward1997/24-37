package İnheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseKrediManager baseKrediManager=new BaseKrediManager();
		OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		KrediUI krediUI=new KrediUI();
		
		krediUI.KrediHesapla(ogretmenKrediManager);

	}

}
