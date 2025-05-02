package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public float iva;

    // costruttore
    public Prodotto(int codice, String nome, String descrizione, float prezzo, float iva) {
        this.codice = generaCodiceRandom();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

    }

    // metodo per generare codice random
    public int generaCodiceRandom() {
        Random rand = new Random();
        return rand.nextInt(90000) + 10000;
    }

    // metodo per il prezzo base
    public float getPrezzoBase() {
        return prezzo;
    }

    // metodo per ottenere prezzo con iva
    public float getPrezzoConIva() {
        return prezzo + (prezzo * iva / 100);

    }
    

    //metodo per prezzo formattato 

    public String getPrezzoFormattatoConIva() {
        DecimalFormat prezzoFormattato = new DecimalFormat("0.00");
        return prezzoFormattato.format(getPrezzoConIva()) + " euro";
    }

    // metodo per ottenere nome+codice
    public String getNomeEsteso() {
        return codice + "-" + nome;
    }
    /*
     * Se imposto gli attributi private allora mi serviranno
     * getter
     * public int getCodice() {
     * return codice;
     * }
     * 
     * 
     * 
     * public String getNome() {
     * return nome;
     * }
     * 
     * public String getDescrizione() {
     * return descrizione;
     * }
     * 
     * public float getPreazzo() {
     * return prezzo;
     * }
     * 
     * public float getIva() {
     * return iva;
     * }
     */

}
