package freeProjects;

import java.util.Scanner;

public class sinifAtlama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Turkce,Matematik,Fen Bilgisi,Sosyal BilgisiiBeden Eğitiminotları giriilis
			//Notnotların ortalaması hesaplansın
			//Ortalama 50'den asaği isie sınıfta kalsın değilse geçsin
		
		
		
		int turkce,matematik,fenBilgisi,sosyalBilgisi,bedenEgitimi;
		double ortalama=0;
		Scanner scan =new Scanner(System.in);
		System.out.print("Türkçe notunu giriniz : ");
		turkce =scan.nextInt();
		System.out.print("Matematik notunu giriniz : ");
		matematik=scan.nextInt();
		System.out.print("\n Fen Bilgisi notunu giriniz : ");
		fenBilgisi=scan.nextInt();
		System.out.print("\n Sosyal Bilgiler notunu giriniz :  ");
		sosyalBilgisi =scan.nextInt();
		System.out.print("\n Beden Eğitimi notunu giriniz : ");
		bedenEgitimi=scan.nextInt();
		ortalama=(turkce+fenBilgisi+sosyalBilgisi+bedenEgitimi+matematik)/5;
		if(ortalama<50)
		{
		System.out.println("Sınıfta Kaldınız");
		System.out.println("Sınıf Ortalaması :"+ ortalama);
		}else {
		System.out.println("Sınıfı geçtiniz...");
		System.out.println("Sınıf Ortalaması :"+ ortalama);
		}
	}

}
