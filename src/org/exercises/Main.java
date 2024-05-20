package org.exercises;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Product prodotto = new Product("Laptop", "Un laptop potente e leggero", new BigDecimal(1000), new BigDecimal(22));


        System.out.println("Codice prodotto: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva());
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());


        prodotto.setNome("Laptop ricondizionato");
        prodotto.setDescrizione("Un laptop potente di seconda mano");
        prodotto.setPrezzo(new BigDecimal(500));
        prodotto.setIva(new BigDecimal(23));


        System.out.println();
        System.out.println("Dopo le modifiche:");
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva());
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
    }
}
