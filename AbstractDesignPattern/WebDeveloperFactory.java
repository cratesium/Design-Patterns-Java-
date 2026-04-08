package AbstractDesignPattern;

public class WebDeveloperFactory implements AbstractFactory {

    @Override
    public Developer getDeveloperObject() {
        return  new WebDeveloper();
    }
}
