package org.example;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Produkt.java
//  @ Date : 22.05.2025
//  @ Author : 
//
//


public class Produkt {

	private String nazwa;
	private double cena;

	public Produkt(String nazwa, double cena) {
		this.nazwa = nazwa;
		this.cena = cena;
	}

	public double getCena() {
		return cena;
	}
	
	public String getOpis() {
		return "Produkt: " + nazwa + "Cena: " + cena + "zl";
	}
}
