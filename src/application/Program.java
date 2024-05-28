package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantos quartos quer ocupar?");
		int n = Sc.nextInt();
		Rent [] rent = new Rent[10];
		
		for (int i = 1; i<n; i++) {
			
			System.out.println("Quarto#: "+ i + ":" );
			Sc.nextLine();
			System.out.println("Digite o nome:");
			String name = Sc.nextLine();
			System.out.println("Digite o email:");
			String email = Sc.nextLine();
			System.out.println("Digite o numero do quarto");
			int roomNumber = Sc.nextInt();
			
			rent[roomNumber]  = new Rent(name,email);
		}
			System.out.println("Quartos ocupados:");
			for (int i = 0; i<10; i++) {
				if(rent[i] != null) {
					System.out.println(i + ":" + rent[i]);
				}
			}
			
			Sc.close();
			
			
			
			
			
			
		}
		
	}


