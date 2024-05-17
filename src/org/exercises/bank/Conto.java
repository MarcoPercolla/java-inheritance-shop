package org.exercises.bank;

import java.util.Random;
import java.math.BigDecimal;

public class Conto {
    private int numeroDiConto;
    private String nomeProprietario;
    private BigDecimal saldo;


    public Conto(String nomeProprietario) {
        this.numeroDiConto = generateRandomAccountNumber();
        this.nomeProprietario = nomeProprietario;
        this.saldo = new BigDecimal(0);
    }


    private int generateRandomAccountNumber() {
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }


    public int getNumeroDiConto() {
        return numeroDiConto;
    }


    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }


    public BigDecimal getSaldo() {
        return saldo;
    }


    public void versa(BigDecimal somma) {
        if (somma.compareTo(somma.subtract(somma)) > 0 ) {
            saldo = saldo.add(somma) ;
            System.out.println("Versamento effettuato. Saldo attuale: " + getSaldoFormattato());
        } else {
            System.out.println("La somma da versare deve essere positiva.");
        }
    }


    public void preleva(BigDecimal somma) {
        if (somma.compareTo(somma.subtract(somma)) > 0) {
            if (saldo.compareTo(somma)>=0 ) {
                saldo = saldo.subtract(somma) ;
                System.out.println("Prelievo effettuato. Saldo attuale: " + getSaldoFormattato());
            } else {
                System.out.println("Saldo insufficiente per effettuare il prelievo.");
            }
        } else {
            System.out.println("La somma da prelevare deve essere positiva.");
        }
    }


    public String getSaldoFormattato() {
        return String.format("%.2f€", saldo);
    }


    public String getInformazioniConto() {
        return "Numero di conto: " + numeroDiConto + "\nProprietario: " + nomeProprietario + "\nSaldo: " + getSaldoFormattato();
    }
}
