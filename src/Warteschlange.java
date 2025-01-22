public class Warteschlange {
    private Kunde erster;

    public Warteschlange(){

    }

    public Kunde gibErsten(){
        return erster;
    }

    public void entfernen() {
        Kunde aktuellerKunde = erster ;
        if( erster!= null){
            erster = aktuellerKunde.getNachfolger();
        }
    }

    public void einfuegen(Kunde pKunde){
        Kunde aktuellerKunde = erster;
        if (erster == null){
            erster = pKunde;
        }
        else{
            while(aktuellerKunde.getNachfolger() != null) {
                aktuellerKunde = aktuellerKunde.getNachfolger();
            }
            aktuellerKunde.setNachfolger(pKunde);
        }
    }
}