package AbstractDesignPattern;

public class  DeveloperFactory {

    public static Developer getObject(AbstractFactory abstractFactory){
        return  abstractFactory.getDeveloperObject();
    }
}
