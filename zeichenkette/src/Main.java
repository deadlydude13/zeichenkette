import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nl = "\n";
        System.out.println(nl + " === Zeichenkette eingeben und überprüfen, wie oft ein Buchstabe vorkommt. ===");
        Scanner scanner = new Scanner(System.in);
        char repeat = 'j';

        while (repeat != 'n') {
            System.out.print(nl + "Zeichenkette eingeben: ");
            String word = scanner.nextLine();
            // Anzahl der Zeichen im Wort
            int wordLength = word.length();
            System.out.println(nl + "Anzahl der Zeichen: " + wordLength);
            // Anzahl der Buchstaben im Wort
            int letterCount = 0;
            for (int i = 0; i < wordLength; i++) {
                char c = word.charAt(i);
                if (Character.isLetter(c)) {
                    letterCount++;
                }
            }
            System.out.println(nl + "Anzahl der Buchstaben: " + letterCount);
            // Anzahl des eingegebenen Zeichens im Wort
            System.out.print(nl + "Wie oft kommt Buchstabe [] for? Buchstabe eingeben: ");
            String character = scanner.nextLine();
            int charCount = 0;
            if (character.length() == 1) {
                char c = character.charAt(0);
                for (int i = 0; i < wordLength; i++) {
                    if (word.charAt(i) == c) {
                        charCount++;
                    }
                }
                System.out.println(nl + "Buchstabe " + c + " kommt: " + charCount + " Mal vor.");
            } else {
                System.out.println("Bitte geben Sie nur ein Zeichen ein.");
            }

            System.out.print("Wiederholen? (j/n) ");
            repeat = scanner.nextLine().charAt(0);
        }
        System.out.println(nl + "Programm beendet!");
    }
}
