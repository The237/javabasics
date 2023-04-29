package generics;

// Generic class with 2 parameters
public class MyGenericClass <Thing, Thing2>{
    Thing x;
    Thing2 y;

    public MyGenericClass(Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing getX() {
        return x;
    }

    public Thing2 getY() {
        return y;
    }
}
