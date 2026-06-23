//b03_objekt
//b_partner

public class Hauptprogramm
{
    public static void main(String[] args)
    {
        Wecker wecker1;         // Deklaration der variablen wecker1

        wecker1 = new Wecker(); // erzeugen eines Wecker-objekts

        wecker1.zeigeUhrzeit(); // Benutzen des objekts mit punktnotation
                                // Die Methode zeigeUhrzeit hat keinen parameter
 
        wecker1.gibSignalNach(5); // Die Methode gibSignalNach() erhaelt eine
                                  // PARAMETER vom Typ int. Der wert, der in den
                                  // runden klammern steht wird als AKTUAL-
                                  // PARAMETER bezeichnet
                                  // Ein parameter steuert den Ablauf der methode.
                                  // Hier wird ein expliziter wert (Literal) als
                                  // parameter benutzt.

        int sekunden = 7;
       wecker1.gibSignalNach(sekunden); // Hier wird eine variable als Parameter
                                        // benutzt.

        wecker1.zeigeUhrzeit();

    }

}