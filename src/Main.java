import javax.swing.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Locale;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // first test
        /*System.out.print("Hello World");
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
        System.out.println("y: "+y);*/

        // get user input
        /*Scanner scanner = new Scanner(System.in);
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
        System.out.println("You like  "+food);*/

        // GUI program
        /*String name = JOptionPane.showInputDialog("Input your name");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You're "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"You're "+height+" cm tall");*/

        // Math methods
        /*double x = 3.14;
        double y = -10;
        double  z = Math.round(x);
        System.out.println(z);

        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a: ");
        a = scanner.nextDouble();
        System.out.println("Enter side a: ");
        b = scanner.nextDouble();
        c = Math.sqrt((a*a)+(b*b));
        System.out.print("The hypothenuse is "+c);*/

        // if statements
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if(age >= 18){
            System.out.println("You are an adult");
        } else if(age>=75) {
            System.out.println("You are an enemy");
        } else if(age>=18) {
            System.out.println("You are an enemy");
        }
        else {
            System.out.println("You are not an adult");
        }*/

        // Switch
        Scanner scanner = new Scanner(System.in);
        // set the locale corresponding to english
        System.out.println("Enter a day of the week: ");
        String day = scanner.nextLine();
        switch (day.toLowerCase()) {
            case "sunday" -> System.out.println("it's Sunday !");
            case "monday" -> System.out.println("it's Monday !");
            case "tuesday" -> System.out.println("it's Tuesday !");
            case "wednesday" -> System.out.println("it's Wednesday !");
            case "thursday" -> System.out.println("it's Thursday !");
            case "friday" -> System.out.println("it's Friday !");
            case "saturday" -> System.out.println("it's Saturday !");
            default -> System.out.println("Wrong day of the week !");
        }
    }
}