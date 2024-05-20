package org.exercises;
import java.math.BigDecimal;

class Television extends Product{

    private int dimensions;
    private boolean isSmart;

    public Television(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, int dimensions, boolean isSmart) {
        super(nome, descrizione, prezzo, iva);
        this.dimensions = dimensions;
        this.isSmart = isSmart;

    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String toString() {
        return super.toString() + ", Dimensioni: " + dimensions + " pollici, Smart: " + (isSmart ? "Sì" : "No");
    }
}
