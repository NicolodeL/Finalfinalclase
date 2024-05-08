package Usuario;

import java.util.Scanner;

public class Utils {
    public static boolean isValidEmail(String email) {
        return email.contains("@");
    }

    public static boolean isValidAlias(String alias) {
        return alias.matches("[a-zA-Z0-9]+");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static String leerCadena() {
        return scanner.nextLine();
    }

    public static int leerEntero() {
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, introduzca un número entero válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static float leerFloat() {
        while (!scanner.hasNextFloat()) {
            System.out.println("Por favor, introduzca un número flotante válido.");
            scanner.next();
        }
        return scanner.nextFloat();
    }

    public static double leerDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, introduzca un número double válido.");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
