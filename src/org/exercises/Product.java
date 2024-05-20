package org.exercises;
import java.util.Random;
import java.math.BigDecimal;

public class Product {
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal iva;


    public Product(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        this.code = generateRandomCode();
        this.name = nome;
        this.description = descrizione;
        this.price = prezzo;
        this.iva = iva;
    }


    private int generateRandomCode() {
        Random random = new Random();
        return random.nextInt(1000000); // Genera un numero tra 0 e 999999
    }


    public String getCodice() {
        return String.format("%06d", code); // Padleft a 6 caratteri
    }


    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }


    public String getDescrizione() {
        return description;
    }

    public void setDescrizione(String descrizione) {
        this.description = descrizione;
    }



    public void setPrezzo(BigDecimal prezzo)  {
        this.price = prezzo;
    }


    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }



    public BigDecimal getPrezzoBase() {
        return price;
    }


    public BigDecimal getPrezzoConIva() {
        return price.add(price.multiply(iva));
    }


    public String getNomeEsteso() {
        return getCodice() + "-" + name;
    }

    @Override
    public String toString() {
        return "Codice: " + getCodice() + ", Nome: " + name + ", Descrizione: " + description + ", Prezzo: " + price + "€, Prezzo con IVA: " + getPrezzoConIva() + "€";
    }
}