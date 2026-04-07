package FactoryDesignPattern;

public class ClientCardProcessor {
  public  static void main(String[] args) throws  Exception{


      System.out.println("TIGHT COUPLING STARTS ");
      //Tight coupling --> here client has to define which class object it required so it would have to manually create and inject it
      Card card1 = new HeartCardType();
      card1.getCardAce();

      //Tight coupling --> here client has to define which class object it required so it would have to manually create and inject it

      Card card2 = new ClubCardType();
      card2.getCardAce();

      //Tight coupling --> here client has to define which class object it required so it would have to manually create and inject it

      Card card3 = new DiamondCardType();
      card3.getCardAce();

      //Tight coupling --> here client has to define which class object it required so it would have to manually create and inject it

      Card card4 = new SpadesCardType();
      card4.getCardAce();


      System.out.println("TIGHT COUPLING ENDS ");


      System.out.println("Loose coupling using the factory design pattern ===>>>> STARTS");


      Card card5 = CardObjectFactory.getCardObjectBasedOnTheType("heart");
      card5.getCardAce();


      Card card6=CardObjectFactory.getCardObjectBasedOnTheType("club");
      card6.getCardAce();

      Card card7=CardObjectFactory.getCardObjectBasedOnTheType("diamond");
      card7.getCardAce();

      Card card8=CardObjectFactory.getCardObjectBasedOnTheType("spade");
      card8.getCardAce();




      //EXCEPTION AREA :

//
//      Card card9=CardObjectFactory.getCardObjectBasedOnTheType("shikhar");
//      card9.getCardAce();
     // Exception

      /**
       *
       * Exception in thread "main" java.lang.RuntimeException: Invalid card Type
       * 	at FactoryDesignPattern.CardObjectFactory.getCardObjectBasedOnTheType(CardObjectFactory.java:20)
       * 	at FactoryDesignPattern.ClientCardProcessor.main(ClientCardProcessor.java:34)
       * */




      System.out.println("Loose coupling using the factory design pattern ===>>>> ENDS");






  }
}



/**  OUTPUT
 *
 TIGHT COUPLING STARTS
 Ace of Hearts
 ACE OF CLUB
 ACE OF Diamonds
 ACE OF SPADES
 TIGHT COUPLING ENDS
 Loose coupling using the factory design pattern ===>>>> STARTS
 Ace of Hearts
 ACE OF CLUB
 ACE OF Diamonds
 ACE OF SPADES
 Loose coupling using the factory design pattern ===>>>> ENDS



 *
 * */