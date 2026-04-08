package AbstractDesignPattern;

public class AndroidDeveloperFactory implements AbstractFactory {
    @Override
    public Developer getDeveloperObject() {
        return new AndroidDevelper();
    }
}
