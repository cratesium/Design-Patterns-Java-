package FactoryDesignPattern;

public class ClubCardType  implements  Card{

    @Override
    public String getCardAce() {
        System.out.println("ACE OF CLUB");
        return "ACE OF CLUB";
    }
}
