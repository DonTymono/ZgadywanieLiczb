import java.util.Scanner;

public class ZgadywanieLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        zgadywarka zgadula = new zgadywanka();
        zgadula.start();

        while (true) {
            System.out.println("Czy Twoja liczba to " + zgadula.Zgadywana() + "?");
            System.out.println("Wpisz 'za dużo', 'za mało' lub 'zgadłeś'");

            String input = scanner.nextLine();
            if (input.equals("za dużo")) {
                zgadula.zaDuzo();
            } else if (input.equals("za mało")) {
                zgadula.zaMalo();
            } else if (input.equals("zgadłeś")) {
                System.out.println("Wygrałem! Udało się w: " + zgadula.kroki() + " krokach.");
                break;
            } else {
                System.out.println("Zła odpowiedź.");
            }

            if (zgadula.kroki() > 10) {
                System.out.println("Nie udało się odgadnąć w 10 krokach.");
                break;
            }
        }
    }
}
