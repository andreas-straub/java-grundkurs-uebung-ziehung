package grundkurs;

import java.security.SecureRandom;
import java.util.Date;

public class Zufallsgenerator {

    /**
     * Generates a random number in the prodived range
     *
     * @param min min number inclusive
     * @param max max number inclusive
     * @return A random number in the prodived range
     */
    public static int generiereZufallszahl(int min, int max) {
        SecureRandom rand = new SecureRandom();
        rand.setSeed(new Date().getTime());
        return rand.nextInt((max - min) + 1) + min;
    }
}
