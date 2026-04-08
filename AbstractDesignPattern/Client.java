package AbstractDesignPattern;

public class Client {
    static void main() {
       Developer webd = DeveloperFactory.getObject(new WebDeveloperFactory());
    }
}
