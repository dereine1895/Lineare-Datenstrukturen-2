import java.util.Scanner;

public class Verwaltung {

    private Scanner scanner;

    public static void main(String[] args) {
        new Verwaltung();
        System.out.println("Herzlich willkommen zu Zeichenketten verschluesselerer!");
    }

    public Verwaltung() {
        scanner = new Scanner(System.in);

        // Instanzierung der Warteschlange, des Stacks und der Liste
        Warteschlange<Kunde> warteschlange = new Warteschlange<>();
        Stack<Kunde> stack = new Stack<>();
        List<Kunde> list = new List<>();

        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Warteschlange verwalten");
            System.out.println("[2] Stack verwalten");
            System.out.println("[3] Liste verwalten");
            System.out.println("[4] Beenden");
            int HauptOption = scanner.nextInt();
            scanner.nextLine(); // Scanner leeren

            switch (HauptOption) {
                case 1:
                    verwalteWarteschlange(warteschlange);
                    break;
                case 2:
                    verwalteStack(stack);
                    break;
                case 3:
                    verwalteListe(list);
                    break;
                case 4:
                    System.out.println("Programm beendet.");
                    return; // Programm beenden
                default:
                    System.out.println("Ungültige Auswahl, bitte versuche es erneut.");
                    break;
            }
        }
    }

    // Warteschlangen-Optionen
    private void verwalteWarteschlange(Warteschlange<Kunde> warteschlange) {
        while (true) {
            System.out.println("== WARTESCHLANGEN MENÜ ==");
            System.out.println("[1] Hinzufügen zur Warteschlange");
            System.out.println("[2] Manuell Hinzufügen zur Warteschlange");
            System.out.println("[3] Entfernen aus der Warteschlange");
            System.out.println("[4] Zeige Inhalt der Warteschlange");
            System.out.println("[5] Zurück zum Hauptmenü");
            int option = scanner.nextInt();
            scanner.nextLine(); // Scanner leeren

            switch (option) {
                case 1:
                    System.out.println("Wie viele Kunden willst du zur Warteschlange hinzufügen?");
                    int numCustomers = scanner.nextInt();
                    for (int i = 0; i < numCustomers; i++) {
                        Kunde kunde = new Kunde("Kunde" + i);
                        warteschlange.einfuegen(kunde);
                    }
                    break;
                case 2:
                    System.out.println("Namen des Kunden angeben, der zur Warteschlange hinzugefügt werden soll:");
                    String name = scanner.nextLine();
                    Kunde kundeM = new Kunde(name);
                    warteschlange.einfuegen(kundeM);
                    break;
                case 3:

                    warteschlange.entfernen();
                    break;
                case 4:
                    Kunde hilfeWarteschlange = (Kunde) warteschlange.gibErsten();
                    if (hilfeWarteschlange != null) {
                        System.out.println("Erster Kunde in der Warteschlange: " + hilfeWarteschlange.getName());
                    } else {
                        System.out.println("Die Warteschlange ist leer.");
                    }
                    break;
                case 5:
                    return; // Zurück zum Hauptmenü
                default:
                    System.out.println("Ungültige Auswahl, bitte versuche es erneut.");
                    break;
            }
        }
    }

    // Stack-Optionen
    private void verwalteStack(Stack<Kunde> stack) {
        while (true) {
            System.out.println("== STACK MENÜ ==");
            System.out.println("[1] Hinzufügen zum Stack");
            System.out.println("[2] Entfernen aus dem Stack");
            System.out.println("[3] Zeige Inhalt des Stacks");
            System.out.println("[4] Zurück zum Hauptmenü");
            int option = scanner.nextInt();
            scanner.nextLine(); // Scanner leeren

            switch (option) {
                case 1:
                    System.out.println("Namen des Kunden angeben, der zum Stack hinzugefügt werden soll:");
                    String stackName = scanner.nextLine();
                    Kunde stackKunde = new Kunde(stackName);
                    stack.add(stackKunde);
                    break;
                case 2:
                    stack.remove();
                    break;
                case 3:
                    Kunde hilfeStack = stack.getContent();
                    if (hilfeStack != null) {
                        System.out.println("Oberster Kunde im Stack: " + hilfeStack.getName());
                    } else {
                        System.out.println("Der Stack ist leer.");
                    }
                    break;
                case 4:
                    return; // Zurück zum Hauptmenü
                default:
                    System.out.println("Ungültige Auswahl, bitte versuche es erneut.");
                    break;
            }
        }
    }

    // Liste-Optionen
    private void verwalteListe(List<Kunde> liste) {
        while (true) {
            System.out.println("== LISTE MENÜ ==");
            System.out.println("[1] Hinzufügen zur Liste");
            System.out.println("[2] Einfügen an der aktuellen Position");
            System.out.println("[3] Entfernen aus der Liste");
            System.out.println("[4] Zeige Inhalt der Liste");
            System.out.println("[5] Zurück zum Hauptmenü");
            int option = scanner.nextInt();
            scanner.nextLine(); // Scanner leeren

            switch (option) {
                case 1:
                    System.out.println("Namen des Kunden angeben, der zur Liste hinzugefügt werden soll:");
                    String listeName = scanner.nextLine();
                    Kunde listeKunde = new Kunde(listeName);
                    liste.append(listeKunde);
                    break;
                case 2:
                    System.out.println("Namen des Kunden angeben, der an der aktuellen Position eingefügt werden soll:");
                    String insertName = scanner.nextLine();
                    Kunde insertKunde = new Kunde(insertName);
                    liste.insert(insertKunde);
                    break;
                case 3:
                    liste.remove();
                    break;
                case 4:
                    if (liste.isEmpty()) {
                        System.out.println("Die Liste ist leer.");
                    } else {
                        if (liste.Erster.getNachfolger() == null) {
                            System.out.println("Erster Kunde in der Liste: " + liste.Erster.getContent().name);
                        } else {
                            while (liste.Aktueller != null) {
                                System.out.println("Kunde: " + liste.Aktueller.getContent().name);
                                liste.Aktueller = liste.Aktueller.getNachfolger();
                            }
                            if (liste.Aktueller == null) {
                                liste.Aktueller = liste.Erster;
                            }
                        }
                    }
                    break;
                case 5:
                    return; // Zurück zum Hauptmenü
                default:
                    System.out.println("Ungültige Auswahl, bitte versuche es erneut.");
                    break;
            }
        }
    }
}