public class Warteschlange {
    private Kunde erster;

    public Warteschlange(){

    }

    public Kunde gibErsten(){
        return erster;
    }

    public void entfernen() {
        Kunde aktuellerKudne = erster ;
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

public class Kunde
{
    private Kunde nachfolger;
    private String name;


    public Kunde(){

    }

    public Kunde(String pName){
        this.hatName = pName;
    }

    public void setNachfolger(Kunde pKunde) {
        nachfolger = pKunde;
    }

    public Kunde getNachfolger() {
        return nachfolger;
    }

    public void setName(String pName){
        hatName= pName;
    }

    public String getName(){
        return hatName;
    }
}