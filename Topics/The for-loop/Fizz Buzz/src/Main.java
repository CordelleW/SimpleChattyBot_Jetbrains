import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int begin = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = begin; i <= end; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;
            if (fizz && buzz ) {
                System.out.println("FizzBuzz");
            } else if (fizz) {
                System.out.println("Fizz");
            } else if (buzz) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}