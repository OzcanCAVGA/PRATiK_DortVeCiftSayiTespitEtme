/*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner yazici = new Scanner(System.in);
        System.out.println("Lutfen bir cift veya 4'un kati sayi giriniz: ");
        int sayi, toplam = 0;
        sayi = yazici.nextInt();
        while (sayi%2==0) {
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
                sayi = yazici.nextInt();
            }

        }
        System.out.println(toplam);

    }
}
