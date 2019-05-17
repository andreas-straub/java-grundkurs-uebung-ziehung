package grundkurs.utils;

import java.util.Scanner;

public class KonsoleUtils {

    private final Scanner scanner;

    private KonsoleUtils(Scanner scanner) {
        this.scanner = scanner;
    }

    public static KonsoleUtils getInstance() {
        return new KonsoleUtils(new Scanner(System.in));
    }

    public String leseText(String hilfeText) {
        System.out.print(hilfeText);
        return scanner.nextLine();
    }

    public int leseZahl(String hilfeText) {
        System.out.print(hilfeText);
        int zahl = scanner.nextInt();
        scanner.nextLine();

        return zahl;
    }
}
