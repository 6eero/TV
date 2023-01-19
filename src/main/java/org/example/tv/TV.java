package org.example.tv;

import org.example.emittente.Canale;
import org.example.emittente.Lingua;
import org.example.tv.exceptions.CanaleNonTrovatoException;

import java.util.HashMap;
import java.util.Map;

/**
 * La TV permette di vedere i programmi (eventualmente con un secondo programma se si
 * attiva la modalità 2-in-1), permette di cambiare o aggiungere le trasmissioni di un
 * canale e permette la ricerca di una trasmissione tra quelle future
 */
public class TV {

    private final Map<Integer, Canale> canali = new HashMap<>();

    private int volume;
    private int luminosita;
    private Lingua lingua;


    /**
     * Metodo che permette di poter visionare un determinato programma
     * (eventualmente con un secondo programma con volume 0 se si attiva la modalità 2-in-1);
     */
    public void visionaTrasmissione(int numeroCanale) throws CanaleNonTrovatoException {

        Canale canale1 = canali.get(numeroCanale);

        if (canale1 == null) {
            throw new CanaleNonTrovatoException("Canale non trovato");
        }

        VisualizzatoreFactory visualizzatoreFactory = new VisualizzatoreFactory();


        visualizzatoreFactory.crea(new Canale());

    }


    /**
     *  Metodo per poter cercare una trasmissione (per titolo, canale, giorno, ora) tra quelle future
     */
    public void cercaTrasmissione() {

    }




}
