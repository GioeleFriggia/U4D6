import java.util.InputMismatchException;
import java.util.Scanner;

public class CarUtils {


    public static void main(String[] args) {
        // Creazione di un oggetto Scanner per l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Chiamata al metodo per calcolare il consumo di carburante
        calcolaConsumo(scanner);
    }

    // Metodo per calcolare il consumo di carburante
    public static void calcolaConsumo(Scanner scanner) {
        try {
            // Richiesta all'utente dei km percorsi
            System.out.print("Inserisci i km percorsi: ");
            double km = scanner.nextDouble();

            // Richiesta all'utente dei litri di carburante consumati
            System.out.print("Inserisci i litri di carburante consumati: ");
            double litri = scanner.nextDouble();

            // Verifica se il numero di litri è 0
            if (litri == 0) {
                // Se sì, genera un'eccezione di tipo ArithmeticException con un messaggio personalizzato
                throw new ArithmeticException("Divisione per zero");
            }

            // Calcolo del consumo di carburante in km/litro
            double kmPerLitro = km / litri;

            // Stampa del consumo di carburante
            System.out.println("Consumo di carburante: " + kmPerLitro + " km/litro");

            // Gestione dell'eccezione se l'utente inserisce un tipo di dato non valido (non numerico)
        } catch (InputMismatchException e) {
            System.out.println("Inserire un numero valido.");

            // Gestione dell'eccezione se viene tentata una divisione per zero
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
