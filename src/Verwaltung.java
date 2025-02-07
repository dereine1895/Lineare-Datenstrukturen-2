import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner;

    public static void main(String[] args) {
        new Verwaltung();
        System.out.println("Herzlich willkommen!");
    }

    public Verwaltung() {
        scanner = new Scanner(System.in);
        Stack<Kunde> speichersystem = new Stack<>();

        while (true) {
            System.out.println("== HAUPTMENÜ ==");

            System.out.println("Welcher Datentyp?");
            System.out.println("[1] Hinzufügen");
            System.out.println("[2] Ersten Auslesen");
            int option = scanner.nextInt();


            if (option == 1) {
                System.out.println("Wie viele?");
                option = scanner.nextInt();
                for (int i = 0; i < option; i++) {
                   speichersystem.add(new Kunde("" + i));
                }
            } else if (option == 2) {
                System.out.println(speichersystem.getContent().getName());
                speichersystem.remove();
            }
        }
    }
}
