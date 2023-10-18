package org.lessons.java.ticketrain;

import java.util.Scanner;

public class TickeTrain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //prezzo per km
        double priceForKm = 0.21;
        // sconto per gli under 18
        double discountunder18 = 0.20;
        // sconto per gli over 65
        double discountover65 = 0.40;

        //Richiesta - Quanti km devi percorrere
        System.out.print("How many km do you have to travel(Km)?: ");
        int travelKm = scan.nextInt();

        //Richiesta - Qual'è la tua età
        System.out.print("What's your age?: ");
        int agePerson = scan.nextInt();

        //Condizioni  - Età
        if (agePerson >= 18 && agePerson <= 65){
            //Se l'età e tra 18 e 65 anni, compresi, allora:
            double resultPrice = travelKm * priceForKm;
            System.out.print("Il prezzo del tuo biglietto: " + resultPrice + " €");
        }
        if (agePerson < 18){
            //Se l'età è minore di 18 anni allora:
            double finalResult =  (travelKm * priceForKm) * discountunder18;
            System.out.print("Il prezzo del tuo biglietto: " + finalResult + " €");
        } else if(agePerson > 65) {
            //Se l'età è maggiore di 65 anni allora:
            double finalResult =  (travelKm * priceForKm) * discountover65;
            System.out.print("Il prezzo del tuo biglietto: " + finalResult + " €");
        }

        scan.close();
    }
}
