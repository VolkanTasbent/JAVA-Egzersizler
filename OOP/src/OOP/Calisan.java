package OOP;

public class Calisan {

	public int no;
	
	public 	String isim;
	
	public String soyisim;
	
	public int tecrube;
	
	public double maas;
	
public Calisan(int no,String isim,String soyisim,int tecrube,double maas) {
	this.no=no;
	this.isim=isim;
	this.soyisim=soyisim;
	this.tecrube=tecrube;
	this.maas=maas;
	}
	

public void calisanBilgileriGoster() {
	System.out.println("**********Çalışan Bilgileri**********");
	System.out.println("no:"+no);
	System.out.println("isim:"+isim);
	System.out.println("soyisim:"+soyisim);
	System.out.println("tecrube:"+tecrube);
	System.out.println("maas:"+maas);
}

public void zamYap(int zamDegeri) {
	
	System.out.println("Maaşınıza"+zamDegeri+"tl kadar zam yapıldı.");
	System.out.println("Güncel Maaşınız:"+(maas+zamDegeri));
}


public void formatAt(String isletimSistemi,String kim) {
	System.out.println("Şu anda "+kim +" "+ isletimSistemi+ "a format atıyor");
}

}



