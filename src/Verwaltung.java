import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner;

    public static void main(String[] args) {
        new Verwaltung();
        System.out.println("Herzlich willkommen!");
    }

    public Verwaltung() {
        scanner = new Scanner(System.in);
        Warteschlange warteschlange = new Warteschlange();

        while (true) {
            System.out.println("== HAUPTMENÜ ==");

            System.out.println("Welcher Datentyp?");
            System.out.println("[1] Hinzufügen");
            System.out.println("[2] Ersten Auslesen");
            int option = scanner.nextInt();


            if (option == 1) {
                System.out.println("Wie viele?");
                int anzahl = scanner.nextInt();
                for (int i = 0; i < anzahl; i++) {
                    warteschlange.einfuegen(new Kunde("Kunde " + i));
                }
            } else if (option == 2) {
                Kunde ersterKunde = warteschlange.gibErsten();
                if (ersterKunde != null) {
                    System.out.println("Erster Kunde: " + ersterKunde.getName());
                    warteschlange.entfernen();
                } else {
                    System.out.println("Die Warteschlange ist leer.");
                }
            }
        }
    }
}
