package org.exercises;
import java.util.Random;

public class Product {
    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;


    public Product(String nome, String descrizione, double prezzo, double iva) {
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



    public void setPrezzo(double prezzo) {
        this.price = prezzo;
    }


    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }


    public double getPrezzoBase() {
        return price;
    }


    public double getPrezzoConIva() {
        return price + (price * iva / 100);
    }


    public String getNomeEsteso() {
        return getCodice() + "-" + name;
    }
}