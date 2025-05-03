package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
    //Attributi, campi, variabili d'istanza
    private int codice;
    private String nome;
    private String descrizione;
    private float prezzo;
    private float iva;

    // costruttore
    public Prodotto(String nome, String descrizione, float prezzo, float iva) {
        this.codice = generaCodiceRandom();
        setNome(nome); // cosi posso scrivere direttamente il nome già con i miei controlli
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

    // metodo per prezzo formattato

    public String getPrezzoFormattatoConIva() {
        DecimalFormat prezzoFormattato = new DecimalFormat("0.00");
        return prezzoFormattato.format(getPrezzoConIva()) + " euro";
    }

    // metodo per ottenere nome+codice
    public String getNomeEsteso() {
        return codice + "-" + nome;
    }

    // getter
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public float getIva() {
        return iva;
    }

    // setter

    public void setNome(String nome) {

        if (nome != null && nome.length() > 0){
            // nomeFormattato 
        this.nome = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
        } else {
            System.out.println("Inserisci un nome valido");
            this.nome = "X";
        }
        
    }

}
