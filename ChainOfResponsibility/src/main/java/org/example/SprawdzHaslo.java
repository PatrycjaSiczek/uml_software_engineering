package org.example;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : SprawdzHaslo.java
//  @ Date : 10.06.2025
//  @ Author : 
//
//

public class SprawdzHaslo extends Sprawdz {
	@Override
	public void obsluz(Uzytkownik uzytkownik) {
		System.out.println("Sprawdzam hasło");
		if ("haslo123".equals(uzytkownik.haslo)) {
			System.out.println(" Uwierzytelniono przez haslo.");
		} else {
			System.out.println("Błędne hasło.");
			przekazDalej(uzytkownik);
		}
	}
}
