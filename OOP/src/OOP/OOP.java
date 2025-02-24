package OOP;

import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);

	System.out.println("**********Çalışan Bilgilendirme Sistemi*****");
	
	System.out.println("Kullanıcı No:");
	int no =scanner.nextInt(); 
	scanner.nextLine();
	
	System.out.println("İsim:");
	String isim =scanner.nextLine(); 
	
	System.out.println("Soyisim:");
	String soyisim =scanner.nextLine(); 
	
	System.out.println("Tecrube:");
	int tecrube =scanner.nextInt(); 
	scanner.nextLine();
	
	System.out.println("Maas:");
	double maas =scanner.nextDouble(); 
	
	Calisan calisan1=new Calisan(no, isim, soyisim, tecrube, maas);
	
	String islemler = "1 - Çalışan Bilgilerini Göster \n"
			+"2 - Zam Yap\n"
			+"3 - Format At";
	System.out.println("Seçim Yapınız");
	System.out.println(islemler);
	int secim =scanner.nextInt();
	
	
	switch (secim) {
	case 1: {
		calisan1.calisanBilgileriGoster();
		break;
	}
case 2: {
	System.out.println("Zam Değerini Girinz:");
	int zamDegeri =scanner.nextInt();
		calisan1.zamYap(zamDegeri);
		break;
		
	}
case 3: {
	System.out.println("Formatı Kim Atsın");
	String kim =scanner.nextLine();
	System.out.println(" Format Atılacak Olan İşletim Sistemi");
	String isletimSistemi =scanner.nextLine();
	calisan1.formatAt(kim, isletimSistemi);
	break;
	
}
	}
	}

}
