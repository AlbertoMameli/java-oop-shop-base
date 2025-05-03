package org.lessons.java.shop;

public class Main {

  public static void main(String[] args) {

    Prodotto telefono = new Prodotto("GALAxY", "Smartphone 5G", 1234.55f, 22f);
    
    System.out.println("Nome esteso: " + telefono.getNomeEsteso());
    System.out.println("Descrizione: " + telefono.getDescrizione());
    System.out.println("Prezzo base: " + telefono.getPrezzo() + " euro");
    System.out.println("Prezzo con IVA: " + telefono.getPrezzoConIva() + " euro");
    System.out.println("Prezzo formattato con IVA: " + telefono.getPrezzoFormattatoConIva());

    System.out.println("Affrettati! oggi c'è il nuovo " + telefono.getNome() + " " + telefono.getDescrizione()
        + " a soli " + telefono.getPrezzoFormattatoConIva() + "!" + " Corri in negozio!");
  }

}
