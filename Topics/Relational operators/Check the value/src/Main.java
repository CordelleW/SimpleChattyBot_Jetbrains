import java.util.Scanner;


class Main {
    public static final int VAL_CHECK = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int val = scanner.nextInt();

        boolean result = val < VAL_CHECK;
        System.out.println(result);
    }
}