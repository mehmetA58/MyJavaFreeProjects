package freeProjects;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int sayi1,sayi2,secim;
		System.out.println("İlk sayiyi giriniz: ");
		sayi1=scan.nextInt();
		System.out.println("\nİkinci sayıyı giriniz : ");
		sayi2=scan.nextInt();
		System.out.println("\n Lütfen yapmak istediğiniz işlemi seçiniz :");
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçiminiz : ");
		secim=scan.nextInt();
		
		if(secim ==1){
		System.out.println("Toplama: " +(sayi1+sayi2));
		}else if(secim==2) {
		System.out.println("Çıkarma : " +(sayi1-sayi2));
		}else if(secim==3) {
			System.out.println("Çarpma : "+(sayi1*sayi2));
		}else if (secim==4) {
			if(sayi2==0)
				System.out.println("ikinci sayı 0'a eşittir ve sonuç belirsizdir");
			System.out.println("Bölme : "+(sayi1/sayi2));
		}
	}
}
