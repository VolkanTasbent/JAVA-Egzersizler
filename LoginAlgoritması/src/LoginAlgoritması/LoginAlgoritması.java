package LoginAlgoritması;

import java.util.Scanner;

public class LoginAlgoritması {
	static boolean hesapAktif=true;
	static int kalanHak =3;

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Giriş Ekranına Hoşgeldiniz");
		while (hesapAktif) { 
			
			System.out.println("Kullanıcı Adınız:");
			String userName = scanner.nextLine();
			
			System.out.println("Şifreniz:");
			String password = scanner.nextLine();
			
			boolean sonuc =login(userName, password);
			if (sonuc) {
				System.out.println("Başarılı Giriş Yaptınız");
				break;
			}
			else {
				kalanHak--;
				if (kalanHak>0) {
					System.out.println("Hatalı Giriş "+kalanHak+" hakkınız kaldı!");
				}
				else {
					System.out.println("Hakkınız Kalmadı Yekiliye Başvurun");
					break;
				}
				
			}
		}
		}
		
	public static boolean login(String userName,String password) {
		if (userName.equals("volkan") && password.equals("2003") ) {
			return true;
		}
		else {
			
			if (kalanHak==0) {
				hesapAktif=false;
			}
			return false;
		}		
		
		
}}
