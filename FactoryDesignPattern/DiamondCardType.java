package FactoryDesignPattern;

public class DiamondCardType implements  Card {

    @Override
    public String getCardAce() {
        System.out.println("ACE OF Diamonds");
        return "ACE OF Diamonds";
    }
}
