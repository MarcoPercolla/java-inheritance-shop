package org.exercises;

public class Main {
    public static void main(String[] args) {

        Product prodotto = new Product("Laptop", "Un laptop potente e leggero", 1000.00, 22.0);


        System.out.println("Codice prodotto: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva());
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());


        prodotto.setNome("Laptop ricondizionato");
        prodotto.setDescrizione("Un laptop potente di seconda mano");
        prodotto.setPrezzo(500.00);
        prodotto.setIva(23.0);


        System.out.println();
        System.out.println("Dopo le modifiche:");
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva());
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
    }
}
