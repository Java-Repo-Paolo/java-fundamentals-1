package org.lessons.java.ferragnezparty;

import java.util.Scanner;
public class party {
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
