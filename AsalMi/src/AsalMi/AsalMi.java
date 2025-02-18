package AsalMi;

import java.util.Scanner;

public class AsalMi {

    public static void main(String[] args) {
        int asalOlmayanToplam = 0;  // Asal olmayan sayılar toplamı
        int asalToplam = 0;  // Asal sayılar toplamı
        String asalSayilar = "";
        String asalOlmayanSayilar = "";
        
        System.out.println("Asal Bulma Uygulamasına Hoşgeldiniz");
        System.out.println("---------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi Kaç elemanlı olsun?");
        int elemanSayisi = scanner.nextInt();
        int[] sayilar = new int[elemanSayisi];
        
        // Dizinin elemanlarını kullanıcıdan alıyoruz
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Dizinin " + (i + 1) + ". elemanını giriniz:");
            sayilar[i] = scanner.nextInt();
        }

        // Asallık kontrolünü yapıyoruz
        for (int sayi : sayilar) {
            boolean asalMi = true;

            if (sayi <= 1) {
                asalMi = false;  // 1 ve daha küçük sayılar asal değildir
            } else {
                // 2'den sayıya kadar kontrol yapıyoruz
                for (int j = 2; j < sayi; j++) {
                    if (sayi % j == 0) {
                        asalMi = false;
                        break; // Bir bölen bulunduğunda daha fazla kontrol yapmaya gerek yok
                    }
                }
            }

            if (asalMi) {
                asalToplam += sayi;  // Asal sayılar toplamını ekliyoruz
                asalSayilar += sayi + " ";  // Asal sayıları sırasıyla yazıyoruz
            } else {
                asalOlmayanToplam += sayi;  // Asal olmayan sayılar toplamını ekliyoruz
                asalOlmayanSayilar += sayi + " ";  // Asal olmayan sayıları sırasıyla yazıyoruz
            }
        }

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("Asal Bilgiler");
        System.out.println("Asal Toplam: " + asalToplam + " Asal Sayılar: " + asalSayilar);
        System.out.println("Asal Olmayan Bilgiler");
        System.out.println("Asal Olmayan Toplam: " + asalOlmayanToplam + " Asal Olmayan Sayılar: " + asalOlmayanSayilar);
    }
}
