/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
 */
import java.time.OffsetDateTime;
import java.time.Month;
import java.time.DayOfWeek;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("La data completa è " + data);

        int anno = data.getYear();
        Month mese = data.getMonth();
        int giorno = data.getDayOfMonth();
        DayOfWeek giornoSettimana = data.getDayOfWeek();

        System.out.println("L'anno è " + anno);
        System.out.println("Il mese è " + mese);
        System.out.println("Il giorno del mese è: " + giorno);
        System.out.println("Il giorno della settimana è: " + giornoSettimana);

    }
}