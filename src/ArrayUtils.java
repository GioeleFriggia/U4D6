import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {

    public static void esercizio1(Scanner scanner) {
        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        System.out.println("Array originale:");
        stampaArray(array);

        int posizione;
        int numero;

        do {
            try {
                System.out.print("Inserisci il numero da aggiungere (0 per terminare): ");
                numero = scanner.nextInt();
                if (numero == 0) break;

                System.out.print("Inserisci la posizione: ");
                posizione = scanner.nextInt();

                if (posizione < 0 || posizione >= array.length) {
                    throw new IndexOutOfBoundsException("Posizione non valida");
                }

                array[posizione] = numero;
                System.out.println("Nuovo stato dell'array:");
                stampaArray(array);

            } catch (InputMismatchException e) {
                System.out.println("Inserire un numero valido.");
                scanner.next(); // Pulisce il buffer di input
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Errore: " + e.getMessage());
            }
        } while (true);
    }

    public static void stampaArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
