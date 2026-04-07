package breakingSingleTonPattern;

public class Caller {

   public static void main() {

        System.out.println("Starting the breaking Singlton pattern caller ====> starts ");


        SingletonClass singletonClassObj1 = SingletonClass.getSingletonClassObj();
        SingletonClass singletonClassObj2 = SingletonClass.getSingletonClassObj();
        System.out.println("comparing both obj hash code :- ");
        System.out.println(singletonClassObj1.hashCode());
        System.out.println(singletonClassObj2.hashCode());
       System.out.println(singletonClassObj1.hashCode()==singletonClassObj2.hashCode());






        System.out.println("ending  the breaking Singlton pattern caller ====> ends  ");


   }

}
