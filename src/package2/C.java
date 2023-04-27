package package2;
import package1.*;

public class C {

    // Will be visible anywhere, also in other packages (ex: package2)
    // due to the public modifier word
    public String publicMessage = "This is public";
    String defaultMessage = "This is the default";
    protected String protectedMessage = "This is protected";
    private String privateMessage = "This is a private message";

}
