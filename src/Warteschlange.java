public class Warteschlange {
    private Kunde erster;

    public Warteschlange() {

    }

    public Kunde gibErsten() {
        return erster;  // Wenn die Warteschlange leer ist, wird null zurückgegeben
    }

    public void entfernen() {
        if (erster != null) {
            erster = erster.getNachfolger();
        }
    }

    public void einfuegen(Kunde pKunde) {
        if (pKunde == null) {
            throw new IllegalArgumentException("Kunde darf nicht null sein");
        }

        if (erster == null) {
            erster = pKunde;
        } else {
            Kunde aktuellerKunde = erster;
            while (aktuellerKunde.getNachfolger() != null) {
                aktuellerKunde = aktuellerKunde.getNachfolger();
            }
            aktuellerKunde.setNachfolger(pKunde);
        }
    }
}