package package1;
import package2.*;

public class A {
    // accessible to a different class and a different package
    // protected String protectedMessage = "This is protected";

    public static void main(String[] args){
        B b = new B();
        // not accessible due to the private modifier
        // System.out.println(b.privateMessage);
    }

}
