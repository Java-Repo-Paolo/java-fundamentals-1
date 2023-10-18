package org.lessons.java.ferragnezparty;

import java.util.Scanner;

/*
Esercizio 2: Festa a casa Ferragnez
State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi che accedano alla festa solo gli invitati presenti sulla lista (in fondo al post)
implementare lo stesso programma usando il ciclo while
*/

public class PartyFerragnezWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] list = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.print("Search guest: ");
        String findGuest= scan.nextLine();

        boolean found = false;

        //Inizio ciclo While
        int i = 0;

        while (i < list.length) {
            if (findGuest.equals(list[i])) {
                found = true;
                break;
            }
            i++;
        }

        if (found) {
            System.out.println("L'invitato " + findGuest + " è presente nella lista.");
        } else {
            System.out.println("L'invitato " + findGuest + " non è presente nella lista.");
        }

        scan.close();
    }
}
