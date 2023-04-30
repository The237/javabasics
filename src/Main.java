import Serializer.User;
import Threads.MyRunnable;
import Threads.MyThread;
import generics.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.*;
import java.util.Calendar;
import java.util.TimerTask;
import java.util.Timer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
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
        /*Scanner scanner = new Scanner(System.in);
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
        }*/

        // Loops
        /*Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isBlank()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.print("hello "+name+" you are in !");

        int number;
        System.out.print("Enter a number to multiply : ");
        number = scanner.nextInt();
        for(int i=0;i<11;i++){
            System.out.println(number +" x "+ i +" = " + number*i);
        }*/

        // Arrays
        /*int[] cars = {0,4,7,10,45,74,4,23};
        for (int car : cars) {
            System.out.println(car);
        }

        int carsOfCars[][] = new int[3][4];
        for(int i=0;i<3;i++)
            for(int j=0;j<4;j++)
                carsOfCars[i][j] = i*j;

        for(int i=0;i<3;i++){
            System.out.println();
            for(int j=0;j<4;j++) {
                System.out.print(carsOfCars[i][j]+" ");
            }
        }*/

        // ArrayList
        /*ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hot-dog");
        food.set(0,"Sandwich");
        food.remove(2);
        // food.clear();
        for(String f:food ){
            System.out.println(f);
        }

        // 2D ArrayList
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomato");
        produceList.add("Zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("Soda");
        drinksList.add("Coca");
        drinksList.add("Coffee");
        drinksList.add("Water");

        System.out.println(drinksList);

        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(1));*/

        // Methods in java
        /*int age = 21;
        String name="OWONA";
        helloWorld(name,age);

        System.out.println("Entrer la valeur du nombre dont vous voulez la table");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Table de multiplication de "+x);
        for (int i = 0; i <= 10; i++) {
            multiply(x,i);
        }*/

        // Methods overloads in java
        /*int x = add(1,-4,2,8);
        System.out.println(x);
        double y = add(4,3);
        System.out.println(y);*/

        // printf method
        /*boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro is an excellent programmer";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("%b\n",myBoolean);
        System.out.printf("%c\n",myChar);
        System.out.printf("%3s\n",myString);
        System.out.printf("%d\n",myInt);
        System.out.printf("%.3f",myDouble);*/

        /*final double PI = 3.14;

        System.out.println(PI);*/

        // OOP
        /*Car mycar = new Car();
        System.out.println(mycar.color);
        System.out.println(mycar.model);
        System.out.println(mycar.make);
        System.out.println(mycar.year);
        System.out.println(mycar.price);

        mycar.drive();
        mycar.brake();*/

        // OOP : Handle constructors
        /*Human h = new Human("Rick",65,86.4);
        Human h2 = new Human("ABEGA",45,78);
        System.out.println(h.name);
        h2.eat();
        h2.drink();*/

        // Global and local
        //DiceRoller diceRoller = new DiceRoller();
        /*Pizza pizza = new Pizza();
        System.out.println("Here are the ingredients of your pizza");
        pizza.bread ="papa";
        System.out.println(pizza.toString());*/

        // Table of objects
        // Food[] refrigarator = new Food[3];
        /*Food f1 = new Food("Cucumber");
        Food f2 = new Food("Pepper");
        Food f3 = new Food("Watermelon");

        Food[] refrigarator = {f1,f2,f3};

        System.out.print(refrigarator[2].name);*/

        /*
        Friend f1 = new Friend("OWONA");
        Friend f2 = new Friend("BOKENGE");
        Friend[] friends = {new Friend("OWONA"),new Friend("PAPA"), new Friend("OKALA")};
        Friend.displayFriends();*/

        // Inheritance
        /* Car2 car = new Car2();
         car.go();

         Bycicle bike = new Bycicle();
         bike.stop();
         System.out.println(car.doors);
         System.out.println(bike.pedals);*/

        // Methods overriding
        /*Dog dog = new Dog();
        dog.speak();*/

        // Handle abstract classes
        // VehiculeAbstract vehicule = new VehiculeAbstract() ();
        /*CarAbstract car = new CarAbstract();
        car.go();*/

        // Encapsulation
        /*CarEncapsulation carE = new CarEncapsulation("Chevrolet","Camaro",2021);
        System.out.println(carE.getMake());
        carE.setMake("Chevrolet0");
        System.out.println(carE.toString());*/

        // Copy of objects
        /*CarEncapsulation carE1 = new CarEncapsulation("Chevrolet","Camaro",2021);
        // CarEncapsulation carE2 = new CarEncapsulation("Ford","Mustang",2018);

        //carE2.copy(carE1);

        // With the copy constructor
        CarEncapsulation carE2 = new CarEncapsulation(carE1);

        System.out.println(carE1);
        System.out.println(carE2);
        // print their properties
        System.out.println(carE1.getMake());
        System.out.println(carE1.getModel());
        System.out.println(carE1.getYear());
        System.out.println(carE1.getMake());
        System.out.println(carE1.getModel());
        System.out.println(carE1.getYear());*/

        // Interfaces
        /*Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();*/

        // Polymorphism
        /*Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();
        Vehicule vehicule = new Vehicule();

        Vehicule cars[] = {car, bicycle, boat, vehicule};
        for(Vehicule v : cars ){
            v.go();
        }*/

        // Dynamic polymorphism , declare the class of an object after the compilation step
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("What animal do you want ? (1 = Dog) or (2 = Cat) : ");
        Animal animal;
        int choice = scanner.nextInt();
        if(choice == 1){
            animal = new Dog();
        }else if(choice ==2) {
            animal = new Cat();
        }
        else {
            animal = new Animal();
            System.out.println("That choice was invalid");
        }
        animal.speak();*/

        // Exceptions
        /*Scanner scanner =new Scanner(System.in);

        try
        {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to divide by : ");
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println("result : " + x);
        }catch (ArithmeticException e){
            System.out.println("You can't divide by 0! ");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter a whole number ! ");
        }
        catch (Exception e){
            System.out.println("Something went wrong !");
        }
        finally {
            scanner.close();
        }*/

        // files
        // File reading
        /*File file = new File("secret_message.txt");
        if(file.exists()){
            System.out.println("That file exists! ");
            System.out.println(file.getAbsolutePath());
            file.delete();
        }else {
            System.out.println("That doesn't file exists! ");
        }

        // File writer
        try
        {
            FileWriter writer = new FileWriter("poem.txt ");
            writer.write("Roses are red \nViolets are violet \nBooty booty booty \nRockin' everywhere");
            writer.append("\nA poem by us");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        // File reader
        try {
            FileReader reader = new FileReader("poem.txt");
            int data = reader.read();
            while (data !=-1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }*/

        // JFrame
        /*JFrame frame = new JFrame();
        frame.setSize(420,420);
        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // remove resizable
        frame.setVisible(true); // Make frame visible
        frame.getContentPane().setBackground(new Color(15,18,36)); // change color background

        // read the logo
        ImageIcon image = new ImageIcon("logo.jpg");
        frame.setIconImage(image.getImage());*/

        // new MyFrame();
        // Handle : JLabel

        /*ImageIcon image = new ImageIcon("image.jpg");
        Border border = BorderFactory.createLineBorder(Color.yellow,5);

        JLabel label = new JLabel();
        label.setText("Edouard do you even code ?"); // Set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER ... of imageIcon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageIcon
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Garamond", Font.BOLD,20)); // set font of text
        label.setIconTextGap(50); // set gap of text to image
        label.setBackground(Color.GRAY); //
        label.setOpaque(true);
        label.setBorder(border); // set a border for our Label
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of the content of our label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of the content of our label
        // label.setBounds(100,100,250,250); // set x,y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500,500);
        // frame.setResizable(false);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();*/

        // Handle : JPanels
        /*ImageIcon icon = new ImageIcon("image.jpg");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0, 250,250);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(250,0, 250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250, 500,250);
        greenPanel.add(label);
        greenPanel.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        // add the panels to the frame
        frame.add(redPanel);
        frame.add(yellowPanel);
        frame.add(greenPanel);*/

        // Generics
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {5.5,4.4,3.3,2.2,1.1};
        Character[] charArray = {'A', 'E','D','K','P'};
        String[] stringArray = {"A", "E","D" ,"M"};
        // Goal of generics, create a unique method that can handle the
        // print of that 4 arrays, not 4 (one for each array data type)
        //displayArray(intArray);
        //displayArray(charArray);
        //displayArray(doubleArray);
        //displayArray(stringArray);

        /*System.out.println(getFirst(intArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(stringArray));*/

        // Generic classes
        /*MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("OWONA");

        System.out.println(myInt.getX());
        System.out.println(myDouble.getX());
        System.out.println(myChar.getX());
        System.out.println(myString.getX());

        // We are going to create a generic class to hold all the 4 classes above
        MyGenericClass<Integer, Character> myIntG = new MyGenericClass<>(1,'A');
        MyGenericClass<Double, Double> myDoubleG = new MyGenericClass<>(3.14,1.01);
        MyGenericClass<Character, Integer> myCharG = new MyGenericClass<>('@',3);
        MyGenericClass<String, Character> myStringG = new MyGenericClass<>("OWONA",'X');

        System.out.println(myIntG.getY());
        System.out.println(myDoubleG.getY());
        System.out.println(myCharG.getY());
        System.out.println(myStringG.getY());*/

        // Same thing as a hashmap

        // Bounded types (coerce the data type of the Thing you want to pass to your Generic
        /*MyGenericClass<Integer, Character> myIntG = new MyGenericClass<>(1,'A');
        MyGenericClass<Double, Double> myDoubleG = new MyGenericClass<>(3.14,1.01);
        MyGenericClass<Double, Integer> myCharG = new MyGenericClass<>(11.5,3);
        MyGenericClass<Integer, Character> myStringG = new MyGenericClass<>(60,'X');

        System.out.println(myIntG.getY());
        System.out.println(myDoubleG.getY());
        System.out.println(myCharG.getY());
        System.out.println(myStringG.getY());*/

        // Serialization
        /*User user = new User();
        user.name = "OWONA";
        user.password = "Core@7P";
        FileOutputStream fileOutputStream = new FileOutputStream("userInfos.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
        out.writeObject(user);
        out.close();
        fileOutputStream.close();
        System.out.println("object infos saved ! :)");*/

        // Deserialization
        /*User user = null;
        FileInputStream fileIn = new FileInputStream("userInfos.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();
        System.out.println(ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID());*/

        // Timer and TimerTask
        /*Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int counter = 10;
            @Override
            public void run() {
                if(counter>0){
                    System.out.println(counter+ " seconds");
                    counter--;
                }else {
                    System.out.println("Happy New !!!");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2023);
        date.set(Calendar.MONTH, Calendar.APRIL);
        date.set(Calendar.DAY_OF_MONTH, 30);
        date.set(Calendar.HOUR_OF_DAY, 1);
        date.set(Calendar.MINUTE, 22);
        date.set(Calendar.SECOND, 50);
        date.set(Calendar.MILLISECOND, 0);

        // timer.schedule(task,0);
        // timer.schedule(task, date.getTime());
        // timer.scheduleAtFixedRate(task,  0, 100);
        timer.scheduleAtFixedRate(task,  date.getTime(), 1000);*/

        // Threads
        /*System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());*/

        /*for(int i=3;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are done !");*/

        // create a second thread along our main thread
        /*MyThread thread2 = new MyThread();
        thread2.setDaemon(true);
        thread2.start();
        System.out.println(thread2.isAlive());
        thread2.setName("Second thread");
        // System.out.println(thread2.getName());
        // System.out.println(thread2.getPriority());
        // System.out.println(Thread.activeCount());*/

        // Multi-threading
        MyThread thread1 = new MyThread();

        // Second manner of thread creation because with that manner, our runnable class can implements multiple
        // interfaces, but cannot extend multiple classes
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread1.join(5000); // calling thread (ex. main or thread2) wait 5 second until the specified thread dies
        thread2.start();
        // although there is an division by o Exception in the main thread, the two thread above will
        // continue to run
        // System.out.println(1/0);

    }

    // print the content of different arrays of type Thing
    public static <Thing> void displayArray(Thing[] array){
        for(Thing x: array){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirst(Thing[] array){
        return array[0];
    }

    //Methods in java
    static void helloWorld(String name, int age){
        System.out.println("Hello "+name+ " you're "+age+" old");
    }

    static void multiply(int x, int i){
        System.out.println(x +" x " + i + " = "+x*i);
    }

    // Overloads Methods in java
    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
        return (a+b);
    }

    static int add(int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return (a+b+c);
    }
    static int add(int a, int b, int c,int d){
        System.out.println("This is overloaded method #3");
        return (a+b+c+d);
    }

    static double add(double a, double b){
        System.out.println("This is overloaded method #4");
        return (a+b);
    }
}