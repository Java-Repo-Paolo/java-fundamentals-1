package org.lessons.java.ferragnezparty;

import java.util.Scanner;
public class PartyFerragnez {

    /*
    State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi che accedano alla festa solo gli invitati presenti sulla lista (in fondo al post)
    Nel programma bisogna:
    - creare e inizializzare l’array contenente i nomi degli invitati (trovate un esempio in fondo alla traccia)
    - chiedere all’utente come si chiama
    - verificare che il nome sia presente nella lista lasciarlo entrare o rispedirlo cortesemente da dove è venuto
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] list = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.print("Search guest: ");
        String findGuest= scan.nextLine();

        boolean found = false;

        for (int i = 0; i < list.length; i++) {
            if (findGuest.equals(list[i])) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.print("l'invitato è nella lista");
        } else {
            System.out.print("l'invitato non è nella lista");
        }

        scan.close();
    }
}
