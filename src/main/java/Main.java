Napisz program w języku Java, który:

1. Wczyta od użytkownika ciąg znaków i zapisze go jako tablicę znaków.
2. Wczyta dwa indeksy (liczby całkowite), które mają zostać zamienione.
3. Zamieni miejscami znaki znajdujące się na tych pozycjach w tablicy.

    Jeśli którykolwiek indeks jest nieprawidłowy (poza zakresem), należy wyświetlić komunikat o błędzie.
4. Wyświetli zmodyfikowaną tablicę jako tekst

    odpowiedź!!!
    
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Wczytanie ciągu znaków i zapisanie jako tablicę znaków
        System.out.print("Wprowadź ciąg znaków: ");
        String input = scanner.nextLine();
        char[] znaki = input.toCharArray();

        // 2. Wczytanie dwóch indeksów
        System.out.print("Podaj pierwszy indeks do zamiany: ");
        int i = scanner.nextInt();

        System.out.print("Podaj drugi indeks do zamiany: ");
        int j = scanner.nextInt();

        // 3. Sprawdzenie poprawności indeksów i zamiana znaków
        if (i < 0 || i >= znaki.length || j < 0 || j >= znaki.length) {
            System.out.println("Błąd: Jeden lub oba indeksy są poza zakresem.");
        } else {
            // Zamiana miejscami
            char temp = znaki[i];
            znaki[i] = znaki[j];
            znaki[j] = temp;

            // 4. Wyświetlenie zmodyfikowanej tablicy jako tekst
            System.out.print("Zmodyfikowany ciąg: ");
            System.out.println(new String(znaki));
        }

        scanner.close();
    }
}

  
