import java.util.Scanner;

/**
 * test02
 */
public class test02 {
    public static final int MAXANGLE = 360;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angle = in.nextInt();
        System.out.println(angle % MAXANGLE);
        System.out.println(Math.floorMod(angle, MAXANGLE));
    }
}