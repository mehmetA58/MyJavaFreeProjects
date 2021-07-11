package freeProjects;

import java.util.Scanner;

public class EtkinlikOnerme_mySelf {

	public static void main(String[] args) {
		// Hava sıcaklığı al.
		//Sıcaklık 30 veya daha yüksek ise yüzme etkinliği öner
		//5 ve 30 arasında ise sinema öner.
		//4 ve daha az ise kayak yapmayı öner.
		Scanner scan=new Scanner(System.in);
		int sicaklik;
		System.out.println("Hava sıcaklığını giriniz :");
		sicaklik=scan.nextInt();
		
		if(sicaklik >=30){
			System.out.println("Etkinlik :Yüzme");
			}else if(5<=sicaklik && sicaklik<30) {
			System.out.println("Etkinlik:Sinema");
			{
				}
			}
				else if (sicaklik<=4 )
						{
				System.out.println("Etkinlik:Kayak");	
			}
			

	}}
