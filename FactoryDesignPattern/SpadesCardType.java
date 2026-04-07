package FactoryDesignPattern;

public class SpadesCardType implements Card{

    @Override
    public String getCardAce() {
        System.out.println("ACE OF SPADES");
        return "ACE OF SPADES";
    }
}
