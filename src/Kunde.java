public class Kunde {
    private Kunde nachfolger;
    private String name;

    public Kunde(){}
    public Kunde(String pName){
        name=pName;
    }
    /*
    setzt den mit dem Parameter gegebenen Kunden an die letzte Stelle
     */
    public void setNachfolger(Kunde pKunde){
        if (nachfolger==null){
            nachfolger=pKunde;
        }else{
            nachfolger.setNachfolger(pKunde);
        }
    }

    /*
    gib den nachfolgenden Kunden zurück
     */
    public Kunde getNachfolger(){return nachfolger;}

    /*
    setzt den Namen auf den Parameter
     */
    public void setName(String pName){name=pName;}

    /*
    gibt den Namen des Kunden zurueck
     */
    public String getName() {
        return name;
    }
}