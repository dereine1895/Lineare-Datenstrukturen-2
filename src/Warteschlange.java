public class Warteschlange {
    private Kunde erster;

    public Warteschlange(){};
    /*
    gibt den ersten Kunden zurueck
     */
    public Kunde gibErsten(){

        return erster;}
    /*entfernt das erste Element in der Warteschlange und speichert das Zweite als Erstes in erster ab
     */
    public void entfernen(){
        Kunde speicher;
        speicher=erster.getNachfolger();
        erster=speicher;
    }
    /*
    Speicher den mit dem Parameter mitgegebenen Kunden an letzter Stelle in ser Warteschlange
     */
    public void einfuegen(Kunde pKunde){

        if (erster==null){
            erster=pKunde;
        }else{
            erster.setNachfolger(pKunde);
        }
    }
    /*
    gibt wahr zurueck, wenn kein Kunde gespeichert ist
     */
    public boolean gibLeer(){
        if (erster==null){
            return true;
        }else{
            return false;
        }
    }

}