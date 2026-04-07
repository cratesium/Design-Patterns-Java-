package breakingSingleTonPattern;

import java.lang.reflect.Constructor;

public class Caller {

   public static void main() {

        System.out.println("Starting the breaking Singlton pattern caller ====> starts ");
        SingletonClass singletonClassObj1 = SingletonClass.getSingletonClassObj();
        SingletonClass singletonClassObj2 = SingletonClass.getSingletonClassObj();
        System.out.println("comparing both obj hash code :- ");
        System.out.println(singletonClassObj1.hashCode());
        System.out.println(singletonClassObj2.hashCode());
        System.out.println(singletonClassObj1.hashCode()==singletonClassObj2.hashCode());



       System.out.println("breaking starts =====>>>>>>");



       try{


//           Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
//           SingletonClass forcedObject = constructor.newInstance();
//           System.out.println(forcedObject.hashCode());
//ERROR : java.lang.IllegalAccessException: class breakingSingleTonPattern.Caller cannot access a member of class breakingSingleTonPattern.SingletonClass with modifiers "private"



             Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
             constructor.setAccessible(true); // this helps us make the private constructor accessible
             SingletonClass forcedObject = constructor.newInstance();
             System.out.println(forcedObject.hashCode());


             //Singleton Pattern breaked now we can create the constructor here that was private earlier



       }
       catch (Exception e ){
           System.out.println(e);
       }



        System.out.println("ending  the breaking Singlton pattern caller ====> ends  ");


   }

}
