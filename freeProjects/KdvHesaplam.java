package freeProjects;

import java.util.Scanner;

public class KdvHesaplam {

	public static void main(String[] args) {
		double tutar , kdvliFiyat , kdv=0.18;
		
		Scanner İnput =new Scanner(System.in);
		System.out.println("Ürünün tutarını giriniz :");
		tutar = İnput.nextDouble();
		kdvliFiyat=tutar+(tutar*kdv);
		System.out.println("Ürünün Kdv'li Fiyatı: " +kdvliFiyat);
		

	}

}
