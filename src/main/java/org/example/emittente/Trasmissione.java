package org.example.emittente;

import java.time.LocalDateTime;
import java.util.List;

public class Trasmissione {

    private LocalDateTime orario;
    private String titolo;
    private GenereTrasmissione genere;
    private String schedaInformativa;
    private Lingua linguaOriginale;
    private List<Lingua> lingueSupportate;
    private boolean sottotili;

}
