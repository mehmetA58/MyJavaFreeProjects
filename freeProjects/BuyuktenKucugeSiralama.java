package freeProjects;

import java.util.Scanner;

public class BuyuktenKucugeSiralama {
	public static void main(String[] args) {
		// a>b>c veya a>c>b
		//b>a>c veya b>c>a
		//c>a>b veya c>b>a

		Scanner scan= new Scanner(System.in);
		int a, b, c ;
		System.out.println("Sayıları Giriniz");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if(a>b && b>c) {
		if(a>c) {
			System.out.println("a>b>c");
			}else {
				System.out.println("a>c>b");
		}		
	}else if (b>a && b>c); {
			if(a>c) {
				System.out.println("b>a>c");
				}else
					System.out.println("b>c>a");
				}{
				}  { 
				 if( a > b && c>a); {
				 if(c>b)
					System.out.println("c>a>b");
				
					
	}

}}}
