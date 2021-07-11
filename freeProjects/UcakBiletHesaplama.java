package freeProjects;

import java.util.Scanner;

public class UcakBiletHesaplama {

	public static void main(String[] args) {
		// Km birim fiyatı :0.10$
		//12 yaşından küçük ise toplam fiyata %50 indirim
		//12 ve 24 yaş arasında ise %10 indiirm
		//65yaşından büyük ise %30 indirim
		//Gidiş-dönüş alırsa %20 indirim
		//BU KOŞULLARA GÖRE YOLCUDAN GİDECEGİ MESAFEYİ İSTEYİP isteyip; ucak bileti hesaplayan proğram.
		
		Scanner scan = new Scanner(System.in);
	
		int km,yas,tip;
		System.out.print("Mesafeyi Giriniz : ");
		km =scan.nextInt();
		System.out.print("\nYaşınızı Giriniz :");
		yas=scan.nextInt();
		System.out.print("Yolculuk Tipini Seçiniz (1-Tek Gidiş , 2-Gidiş/Dönüş) :");
		tip=scan.nextInt();
		double normalFiyat , yasIndirimi , tipİndirimi;
		if(km>0 && yas>0 && (tip==1|| tip==2)) {
		normalFiyat=km*0.10;
		if(yas<12) {
			yasIndirimi=normalFiyat*0.5;	
		}else if(yas>=12 && yas<=24) {
			yasIndirimi=normalFiyat*0.10;	
		}else if(yas>=65) {
			yasIndirimi=normalFiyat*0.30;	
		}else {
			yasIndirimi=0;
		}
		normalFiyat-=yasIndirimi;
		if(tip==2) {
			tipİndirimi=normalFiyat*0.20;
			normalFiyat=(normalFiyat-tipİndirimi)*2;
		
		}
		
		
		System.out.println("Bilet Tutarı :  $" + normalFiyat);
		}else {
			System.out.println("Girdiğiniz bilgiler eksik veya yanlışLütfen Tekrar Deneyiniz!!");
			
		}
		scan.close();
				

	}

}
