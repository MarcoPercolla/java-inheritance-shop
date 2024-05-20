package org.exercises;
import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    private Product[] products;
    private int numProducts;

    public Carrello(int maxSize) {
        products = new Product[maxSize];
        numProducts = 0;
    }
    public void addProduct(Product product) {
        if (numProducts < products.length) {
            products[numProducts] = product;
            numProducts++;
        } else {
            System.out.println("Carrello pieno. Impossibile aggiungere altri prodotti.");
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < numProducts; i++) {
            result += products[i].toString() + "\n";
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la dimensione massima del carrello: ");
        int maxSize = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Carrello carrello = new Carrello(maxSize);

        boolean continueAdding = true;
        while (continueAdding) {
            System.out.println("Inserisci il tipo di prodotto (1: Smarphone, 2: Televisore, 3: Cuffie, 4: Termina): ");
            int type = scanner.nextInt();
            scanner.nextLine();

            if (type == 0) {
                continueAdding = false;
                break;
            }

            System.out.print("Nome: ");
            String name = scanner.nextLine();
            System.out.print("Descrizione: ");
            String description = scanner.nextLine();
            System.out.print("Prezzo: ");
            BigDecimal price = scanner.nextBigDecimal();
            System.out.print("IVA (in formato decimale, es. 0.22 per 22%): ");
            BigDecimal iva = scanner.nextBigDecimal();
            scanner.nextLine();

            switch (type) {
                case 1:
                    System.out.print("IMEI: ");
                    String imei = scanner.nextLine();
                    System.out.print("Memoria (GB): ");
                    int memory = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    carrello.addProduct(new Smartphone(name, description, price, iva, imei, memory));
                    break;
                case 2:
                    System.out.print("Dimensioni (pollici): ");
                    int dimensions = scanner.nextInt();
                    System.out.print("Smart (true/false): ");
                    boolean isSmart = scanner.nextBoolean();
                    scanner.nextLine(); // Consume newline
                    carrello.addProduct(new Television(name, description, price, iva, dimensions, isSmart));
                    break;
                case 3:
                    System.out.print("Colore: ");
                    String color = scanner.nextLine();
                    System.out.print("Wireless (true/false): ");
                    boolean isWireless = scanner.nextBoolean();
                    scanner.nextLine(); // Consume newline
                    carrello.addProduct(new Headset(name, description, price, iva, color, isWireless));
                    break;
                default:
                    System.out.println("Tipo di prodotto non valido.");
            }
        }
        System.out.println("\nProdotti nel carrello:");
        System.out.println(carrello.toString());

        scanner.close();




    }




}
