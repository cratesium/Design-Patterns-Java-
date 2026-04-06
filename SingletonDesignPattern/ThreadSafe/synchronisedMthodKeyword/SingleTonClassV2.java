package SingletonDesignPattern.ThreadSafe.synchronisedMthodKeyword;

public class SingleTonClassV2 {


    private SingleTonClassV2(){

    }

    private static SingleTonClassV2  SingleTonClassV2 = new SingleTonClassV2();

   //EAGER WAY OF CREATING OBJECT created at start time 
    // no synchro
    public static  SingleTonClassV2 getObject(){
        return SingleTonClassV2;
    }
    
}



