package org.example;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Skrot.java
//  @ Date : 03.06.2025
//  @ Author : 
//
//

public class Skrot {
    private String klawisz;
    private Command command;

    public Skrot(String klawisz, Command command) {
        this.klawisz = klawisz;
        this.command = command;
    }

    public void aktywuj() {
        System.out.println("Aktywowano skrót: " + klawisz);
        command.wykonaj();
    }
}
