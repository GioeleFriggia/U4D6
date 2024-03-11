import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Esercizio #1: Gestione degli errori con array
        ArrayUtils.esercizio1(scanner);

        // Esercizio #2: Gestione dell'eccezione di divisione per zero
        CarUtils.calcolaConsumo(scanner); // Chiamata al metodo calcolaConsumo
    }
}
