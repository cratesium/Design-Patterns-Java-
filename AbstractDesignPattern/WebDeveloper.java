package AbstractDesignPattern;

public class WebDeveloper  implements  Developer{

    @Override
    public String getDesignation() {
        System.out.println("Web Developer");
        return "Web Developer";
    }
}
