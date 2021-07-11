package freeProjects;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in); //kullanıcıdan değer almak için
		String k_adi,parola;	//değerleri belirledim.
		System.out.println("Kullanıcı Adını Giriniz :");	//değer 
		k_adi =scan.nextLine();		//degeri java diliyle istedim
		System.out.println("Parola Giriniz : ");	//değer istedim
		parola=scan.nextLine();		//değeri java diliyle istedim.
		if(k_adi.equals("mehmet")&& parola.equals("195987")) {
			System.out.println("Başarılı bir şekide giriş yaptınız !");
		}else {
		System.out.println("Kulanıcı adınız veya parolanız yanlış !!!");
		}
	}

}
