package FactoryDesignPattern;

import java.util.Locale;

public class CardObjectFactory {

    public static Card getCardObjectBasedOnTheType(String type) throws  Exception{
      if (type.trim().equalsIgnoreCase("heart")){
          return new HeartCardType();
      } else if (type.trim().equalsIgnoreCase("club")) {
          return new ClubCardType();

      } else if (type.trim().equalsIgnoreCase("diamond")) {
          return  new DiamondCardType();
      } else if (type.trim().equalsIgnoreCase("spade")) {
          return new SpadesCardType();

      }
      else{
          throw  new RuntimeException("Invalid card Type");
      }
    }
}
