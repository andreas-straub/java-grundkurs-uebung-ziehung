package grundkurs;

import grundkurs.utils.KonsoleUtils;

public class Ziehung {


    public static void main(String[] args) {

        // Hilfsobjekt für das Einlesen der Benutzereingaben von der Konsole
        KonsoleUtils konsole = KonsoleUtils.getInstance();

        // Anzahl der Teilnehmer von der konsole einlesen
        int anzTeilnehmer = konsole.leseZahl("Wie viele Teilnehmer nehmen an der Ziehung teil? ");

        // Array für die Speicherung der Teilnehmernamen
        String[] teilnehmer = teilnehmerEinlesen(anzTeilnehmer);

        // Eine Zufallszahl in dem Bereich von 0 bis die Anzahlder Teilnehmer - 1 erzeugen, um damit
        // einen Teilnehmer auf dem Array anhand des Indexes zu bestimmten. Der Index in Arrays ist immer 0-basiert.
        int zufallsIndex = Zufallsgenerator.generiereZufallszahl(0, anzTeilnehmer - 1);

        // Ausgabe des Gewinners. Man beachte auch den Ausdruck: "zufallsIndex + 1"
        System.out.println(String.format("Teilnehmer Nr %d. %s wurde gezogen",
                zufallsIndex + 1,
                teilnehmer[zufallsIndex]));
    }

    /**
     * Die Teilnehmernamen von der Konsole einlesen
     *
     * @param anzTeilnehmer Anzahl der Teilnehmer, die eingelesen werden sollen.
     * @return Die eingelesenen Teilnemernahmen als String-Array.
     */
    private static String[] teilnehmerEinlesen(int anzTeilnehmer) {
        String[] teilnehmer = new String[anzTeilnehmer];
        for (int i = 0; i < anzTeilnehmer; i++) {
            teilnehmer[i] = KonsoleUtils.getInstance().leseText((i + 1) + ". Teilnehmer: ");
        }

        return teilnehmer;
    }
}
