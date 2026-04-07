package FactoryDesignPattern;

public class HeartCardType implements  Card {

    @Override
    public String getCardAce() {
        System.out.println("Ace of Hearts");
        return "Ace of Hearts";
    }
}
