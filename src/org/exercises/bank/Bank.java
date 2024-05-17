package org.exercises.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();


        Conto conto = new Conto(nome);
        System.out.println("Conto creato con successo!");
        System.out.println(conto.getInformazioniConto());


        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Versare una somma");
            System.out.println("2. Prelevare una somma");
            System.out.println("3. Uscire");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci la somma da versare: ");
                    double sommaDaVersare = scanner.nextDouble();
                    conto.versa(sommaDaVersare);
                    break;
                case 2:
                    System.out.print("Inserisci la somma da prelevare: ");
                    double sommaDaPrelevare = scanner.nextDouble();
                    conto.preleva(sommaDaPrelevare);
                    break;
                case 3:
                    exit = true;
                    System.out.println("Grazie per aver utilizzato i nostri servizi!");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }

        scanner.close();
    }
}
