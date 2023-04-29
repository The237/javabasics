package Serializer;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1;
    public String name;
    // transient make that field not serializable
    public String password;

    public void sayHello(){
        System.out.println("Hello "+ name);
    }




}
