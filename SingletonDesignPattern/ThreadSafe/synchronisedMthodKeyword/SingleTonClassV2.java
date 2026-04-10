package SingletonDesignPattern.ThreadSafe.synchronisedMthodKeyword;

public class SingleTonClassV2 {


    private SingleTonClassV2(){

    }

    private static SingleTonClassV2  SingleTonClassV2 = new SingleTonClassV2();

   //EAGER WAY OF CREATING OBJECT created at start time 
    // no synchronization is needed as the object is created at class load time and there is no chance of multiple threads creating multiple objects
    public static  SingleTonClassV2 getObject(){
        return SingleTonClassV2;
    }
    
}



