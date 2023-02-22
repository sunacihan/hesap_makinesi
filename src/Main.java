import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayı:");
        double birinci_sayi = input.nextDouble();
        System.out.print("İkinci sayı:");
        double ikinci_sayi = input.nextDouble();

        System.out.println("1: +\n2: -\n3: *\n4: /");
        System.out.print("Seçiminiz:");
        int operator = input.nextInt();

        switch (operator) {
            case 1:
                sonuc = birinci_sayi + ikinci_sayi;
                System.out.print("Sonuç:" + sonuc);
                break;
            case 2:
                sonuc = birinci_sayi - ikinci_sayi;
                System.out.print("Sonuç:" + sonuc);
                break;
            case 3:
                sonuc = birinci_sayi * ikinci_sayi;
                System.out.print("Sonuç:" + sonuc);
                break;
            case 4:
                if (ikinci_sayi != 0) {
                    sonuc = birinci_sayi / ikinci_sayi;
                    System.out.print("Sonuç:" + sonuc);
                }
                else{
                        System.out.println("Sayı sıfıra bölünemez.");
                    }
                break;
            default:
                        System.out.println("Yanlış seçim yaptınız tekrar deneyiniz.");


                }
        }
    }
