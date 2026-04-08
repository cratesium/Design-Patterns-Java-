package AbstractDesignPattern;

public class Client {
    static void main() {
       Developer webd = DeveloperFactory.getObject(new WebDeveloperFactory());
       System.out.println(webd.getDesignation());


       Developer android =DeveloperFactory.getObject(new AndroidDeveloperFactory());
       System.out.println(android.getDesignation());
    }
}


//Output
/**
 *
 Web Developer
 Web Developer
 Android Developer
 Android Developer

 * */