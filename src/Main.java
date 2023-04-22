import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // first test
        System.out.print("Hello World");
        // variables
        // String starts with a capital because it's a reference datatype
        // not primitive like in or others
        String papa = "\npapa est venu à la maison";
        System.out.println(papa);
        // by convention, a long is always followed by a L
        long x = 1122222228533333335L;
        System.out.println("My x value is :"+x);

        // switch variables
        String xw = "water";
        String y = "Kook-Aid";
        String temp = null;
        temp = xw;
        xw = y;
        y = temp;
        System.out.println("x: "+xw);
        System.out.println("y: "+y);

        // get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ?");
        String name  = scanner.nextLine();
        System.out.print("How old are you ?");
        int age = scanner.nextInt();
        System.out.println("What's your favorite food");
        String food = scanner.nextLine();
        // clear the scanner because of the first call of nextline
        scanner.nextLine();

        System.out.println("Hello "+ name);
        System.out.println("You are "+ age + " years old");
        System.out.println("You like  "+food);
    }
}