package breakingSingleTonPattern;

public class SingletonClass {

    private SingletonClass(){}

    public  static  SingletonClass singletonClassObj;


    //Singleton class object with lazy loading  at runtime with thread synchronised

    public static  SingletonClass getSingletonClassObj(){
        if (singletonClassObj==null){

            synchronized (SingletonClass.class){
                if (singletonClassObj==null){

                    singletonClassObj= new SingletonClass();

                }


            }


        }
        return  singletonClassObj;

    }

}
