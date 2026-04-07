package SingletonDesignPattern.ThreadSafe.synchronisedBlock;

public class SingleTonClass {
    String name ;

    // we are needed to allow SingleTonClass to have only one object at any cost 
    // remove the public constructor to block creation of new object 
    // make the object private so it cant be accessed from the outside 
    // create a get method to return  the object by checking the codition that create new object only if object is null otherwise return the current one 

    private static SingleTonClass singleTonClassObj;


    private SingleTonClass(){

    }

    /**
     * 
     * LAZY INITIALZATION wont get called until the client call getSingleTonClassObject()
     * @return
    */

    public static  SingleTonClass getSingleTonClassObject(){

        if (singleTonClassObj==null) {


            ..


            if (singleTonClassObj==null) {
               synchronized (SingleTonClass.class) {
                singleTonClassObj= new SingleTonClass();
                singleTonClassObj.name="Shikhar";
               }
            }

           
            
        }
        return singleTonClassObj;


    }

    
    
}
