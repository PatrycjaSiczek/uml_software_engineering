package org.example;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : WplataCommand.java
//  @ Date : 03.06.2025
//  @ Author : 
//
//

public class WplataCommand extends Command {
	public WplataCommand(Konto konto, float kwota) {
		super(konto, kwota);
	}

	@Override
	public void wykonaj() {
		zapiszKopie();
		konto.wplata(kwota);
	}

	@Override
	public void cofnij() {
		konto.przywrocStan();
	}
}
