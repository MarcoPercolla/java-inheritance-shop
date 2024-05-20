package org.exercises;
import java.math.BigDecimal;

class Smartphone extends Product {

    private String imei;
    private int memory;

    public Smartphone(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String imei, int memory) {
        super(nome, descrizione, prezzo, iva);
        this.imei = imei;
        this.memory = memory;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public BigDecimal getPrezzoScontato() {
        if (memory < 32) {
            return getPrezzoBase().multiply(new BigDecimal("0.95"));
        } else {
            return super.getPrezzoScontato();
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", IMEI: " + imei + ", Memoria: " + memory + "GB";
    }
}
