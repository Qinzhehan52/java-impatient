import java.util.Scanner;

class ch01test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        System.out.printf("%s ", Integer.toBinaryString(num));
        System.out.printf("%o ", num);
        System.out.printf("%x ", num);
        System.out.printf("%h ", 1 / (double) num);
    }
}