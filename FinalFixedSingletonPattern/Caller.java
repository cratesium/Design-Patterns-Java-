package FinalFixedSingletonPattern;

import java.lang.reflect.Constructor;

public class Caller {


    static void main() {
        System.out.println("Implemented the not breakable singleton pattern");
        MainClassItIsSingleton getfirstObject = MainClassItIsSingleton.getSingletonObj();
        System.out.println(getfirstObject.hashCode());

        try {
            Constructor<MainClassItIsSingleton> constructor = MainClassItIsSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);//set to true such that reflection api can modify the changes
            MainClassItIsSingleton secondObject = constructor.newInstance();
            System.out.println(secondObject.hashCode());
       //ERROR: 149928006
            //java.lang.reflect.InvocationTargetException

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
