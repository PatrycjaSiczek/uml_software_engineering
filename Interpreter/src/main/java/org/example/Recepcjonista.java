package org.example;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Recepsjonista.java
//  @ Date : 07.06.2025
//  @ Author : 
//
//

public class Recepcjonista {
	public void sprawdzRezerwacje(Wyrazenie wyrazenie) {
		System.out.println("Sprawdzane warunki:");
		System.out.println(wyrazenie.toString());

		boolean wynik = wyrazenie.interpretuj();

		if (wynik) {
			System.out.println(" Rezerwacja spełnia warunki.");
		} else {
			System.out.println(" Rezerwacja nie spełnia warunków.");
		}
	}
}
