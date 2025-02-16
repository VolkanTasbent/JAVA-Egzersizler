package BankaMatik;

import java.util.Scanner;

public class Banka {

    public static void main(String[] args) {
        // volkan iban=11110000
        // rana iban=00001111
        // enes iban=00110011
        /*
         * bakiye görmek için 1
         * para çekmek için 2
         * farklı hesaba para yatırmak için 3
         * uygulamadan çıkmak için 4
         */

        Double bakiyeVolkan = 500.0;
        String kullaniciVolkan = "vt";
        String sifreVolkan = "2003";
        Integer ibanVolkan = 11110000;

        Integer ibanEnes = 110011;
        Double bakiyeEnes = 20000.0;

        Double bakiyeRana = 10000.0;
        String kullaniciRana = "ra";
        String sifreRana = "2003";
        Integer ibanRana = 1111;

        System.out.println("Bankamatiğe Hoşgeldiniz");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı Adınızı Giriniz:");
        String kullaniciAdi = scanner.nextLine();
        System.out.println("Şifrenizi giriniz");
        String sifre = scanner.nextLine();

        if ((kullaniciAdi.equals(kullaniciRana)) && (sifre.equals(sifreRana))) {
            System.out.println("Rana Hanım Hoşgeldiniz Lütfen Yapmak İstediğiniz İşlemi Seçin:"
                    + "\n1 - Bakiye Görüntüleme"
                    + "\n2 - Para Yükleme"
                    + "\n3 - Para Çekme"
                    + "\n4 - Çıkış");

            Integer secim = scanner.nextInt();
            scanner.nextLine(); // Tamponu temizliyoruz
            switch (secim) {
                case 1: {
                    System.out.println("Rana Güncel Bakiye: " + bakiyeRana);
                    break;
                }

                case 2: {
                    System.out.println("Paranın Hangi Hesaba Yatırılacağını Seçin:"
                            + "\n1 - Kendi Hesabınıza"
                            + "\n2 - Başka Bir IBAN'a");
                    Integer yatanHesap = scanner.nextInt();
                    scanner.nextLine(); // Tamponu temizliyoruz
                    switch (yatanHesap) {
                        case 1: {
                            System.out.println("Eklemek istedğiniz miktarı giriniz:");
                            Double yuklenecek = scanner.nextDouble();
                            bakiyeRana += yuklenecek;
                            System.out.println("İşlem Sonrası Güncel Bakiye: " + bakiyeRana);
                            break;
                        }
                        case 2: {
                            System.out.println("Paranın Gideceği IBAN'i giriniz:");
                            String ibanStr = scanner.nextLine();
                            Integer iban = Integer.parseInt(ibanStr);

                            System.out.println("Eklemek istedğiniz miktarı giriniz:");
                            Double yuklenecek = scanner.nextDouble();

                            if (yuklenecek > bakiyeRana) {
                                System.out.println("Yetersiz Bakiye! İşlem iptal edildi.");
                                break;
                            }

                            if (iban.equals(ibanVolkan)) {
                                bakiyeVolkan += yuklenecek;
                                bakiyeRana -= yuklenecek;
                                System.out.println("İşlem Sonrası Volkan'ın Güncel Bakiyesi: " + bakiyeVolkan);
                                System.out.println("İşlem Sonrası Rana'nın Güncel Bakiyesi: " + bakiyeRana);

                            } else if (iban.equals(ibanEnes)) {
                                bakiyeEnes += yuklenecek;
                                bakiyeRana -= yuklenecek;
                                System.out.println("İşlem Sonrası Enes'in Güncel Bakiyesi: " + bakiyeEnes);
                                System.out.println("İşlem Sonrası Rana'nın Güncel Bakiyesi: " + bakiyeRana);

                            } else {
                                System.out.println("Geçersiz IBAN!");
                            }
                            break;
                        }

                        default:
                            System.out.println("Geçersiz Seçim!");
                    }

                    break;
                }

                case 3: {
                    System.out.println("Çekmek istedğiniz miktarı giriniz:");
                    Double cekilecek = scanner.nextDouble();
                    if (cekilecek <= bakiyeRana) {
                        bakiyeRana -= cekilecek;
                        System.out.println("İşlem Sonrası Güncel Bakiye: " + bakiyeRana);
                        System.out.println("İşlem Sonrası Güncel Bakiye: " + bakiyeVolkan);
                    } else {
                        System.out.println("Yetersiz Bakiye");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Çıkış Yapılıyor...");
                    break;
                }
                default:
                    System.out.println("Hatalı İşlem Seçimi!");
            }

        } else if ((kullaniciAdi.equals(kullaniciVolkan)) && (sifre.equals(sifreVolkan))) {
            System.out.println("Volkan Bey Hoşgeldiniz Lütfen Yapmak İstediğiniz İşlemi Seçin:"
                    + "\n1 - Bakiye Görüntüleme"
                    + "\n2 - Para Yükleme"
                    + "\n3 - Para Çekme"
                    + "\n4 - Çıkış");

            Integer secim = scanner.nextInt();
            scanner.nextLine(); // Tamponu temizliyoruz
            switch (secim) {
                case 1: {
                    System.out.println("Volkan Güncel Bakiye: " + bakiyeVolkan);
                    break;
                }
                case 2: {
                    System.out.println("Paranın Hangi Hesaba Yatırılacağını Seçin:"
                            + "\n1 - Kendi Hesabınıza"
                            + "\n2 - Başka Bir IBAN'a ");
                    Integer yatanHesap = scanner.nextInt();
                    scanner.nextLine(); // Tamponu temizliyoruz
                    switch (yatanHesap) {
                        case 1: {
                            System.out.println("Eklemek istedğiniz miktarı giriniz:");
                            Double yuklenecek = scanner.nextDouble();
                            bakiyeVolkan += yuklenecek;
                            System.out.println("İşlem Sonrası Güncel Bakiye: " + bakiyeVolkan);
                            break;
                        }
                        case 2: {
                            System.out.println("Paranın Gideceği IBAN'i giriniz:");
                            String ibanStr = scanner.nextLine();
                            Integer iban = Integer.parseInt(ibanStr);

                            System.out.println("Eklemek istedğiniz miktarı giriniz:");
                            Double yuklenecek = scanner.nextDouble();

                            if (yuklenecek > bakiyeVolkan) {
                                System.out.println("Yetersiz Bakiye! İşlem iptal edildi.");
                                break;
                            }

                            if (iban.equals(ibanEnes)) {
                                bakiyeEnes += yuklenecek;
                                bakiyeVolkan -= yuklenecek;
                                System.out.println("İşlem Sonrası Enes'in Güncel Bakiyesi: " + bakiyeEnes);
                                System.out.println("İşlem Sonrası Volkan'ın Güncel Bakiyesi: " + bakiyeVolkan);
                            } else if (iban.equals(ibanRana)) {
                                bakiyeRana += yuklenecek;
                                bakiyeVolkan -= yuklenecek;
                                System.out.println("İşlem Sonrası Rana'nın Güncel Bakiyesi: " + bakiyeRana);
                                System.out.println("İşlem Sonrası Volkan'ın Güncel Bakiyesi: " + bakiyeVolkan);

                            } else {
                                System.out.println("Geçersiz IBAN!");
                            }
                            break;
                        }
                        default:
                            System.out.println("Geçersiz Seçim!");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Çekmek istedğiniz miktarı giriniz:");
                    Double cekilecek = scanner.nextDouble();
                    if (cekilecek <= bakiyeVolkan) {
                        bakiyeVolkan -= cekilecek;
                        System.out.println("İşlem Sonrası Güncel Bakiye: " + bakiyeVolkan);
                        
                    } else {
                        System.out.println("Yetersiz Bakiye");
                    }

                    break;
                }
                case 4: {
                    System.out.println("Çıkış Yapılıyor...");
                    break;
                }
                default:
                    System.out.println("Hatalı İşlem Seçimi!");
            }
        } else {
            System.out.println("Kullanıcı Adı veya Şifre Hatalı");
        }
        scanner.close();
    }
}
