package freeProjects;

import java.util.Scanner;

public class DaireninAlaniHesaplama {

	public static void main(String[] args) {
		int r;
		double alan ,hacim ,pi=3.14;
		Scanner İnput=new Scanner(System.in);
		System.out.println("Dairenin yarıcapını giriniz: \n");
		r=İnput.nextInt();
		alan=2*pi*r;
		hacim = pi*(r*r);
		System.out.println("Dairenin Alanı : "+ alan);
		System.out.println("Dairenin Hacmi : "+ hacim);
		

	}

}
