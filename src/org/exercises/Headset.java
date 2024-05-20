package org.exercises;
import java.math.BigDecimal;

 class Headset extends Product{
     private String color;
     private boolean isWireless;
     public Headset(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String color, boolean isWireless) {
         super(nome, descrizione, prezzo, iva);
         this.color = color;
         this.isWireless = isWireless;
     }
     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public boolean isWireless() {
         return isWireless;
     }

     public void setWireless(boolean wireless) {
         isWireless = wireless;
     }

     @Override
     public BigDecimal getPrezzoScontato() {
         if (!isWireless) {
             return getPrezzoBase().multiply(new BigDecimal("0.93"));
         } else {
             return super.getPrezzoScontato();
         }
     }

     @Override
     public String toString() {
         return super.toString() + ", Colore: " + color + ", Wireless: " + (isWireless ? "Sì" : "No");
     }
 }
