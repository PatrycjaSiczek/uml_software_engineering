package org.example;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : SprawdzSms.java
//  @ Date : 10.06.2025
//  @ Author : 
//
//

public class SprawdzSms extends Sprawdz {
	@Override
	public void obsluz(Uzytkownik uzytkownik) {
		System.out.println("Sprawdzam kod SMS.");
		if ("5343".equals(uzytkownik.kodSms)) {
			System.out.println("Uwierzytelniono przez SMS.");
		} else {
			System.out.println("Błędny kod SMS.");
			przekazDalej(uzytkownik);
		}
	}
}
