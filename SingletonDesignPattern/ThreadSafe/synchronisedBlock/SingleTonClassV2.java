package SingletonDesignPattern.ThreadSafe.synchronisedBlock;


public class SingleTonClassV2 {


    private SingleTonClassV2(){

    }

    private static SingleTonClassV2  SingleTonClassV2 = new SingleTonClassV2();

   //EAGER WAY OF CREATING OBJECT created at start time 
   

   /**
    *    //synchronised will allow only one thread to enter inside the method at a time 
   //other threads will wait for the same 
    * @return
    */



       // no synchronization is needed as the object is created at class load time and there is no chance of multiple threads creating multiple objects


       

    public static synchronized SingleTonClassV2 getObject(){
        return SingleTonClassV2;
    }
    
}



