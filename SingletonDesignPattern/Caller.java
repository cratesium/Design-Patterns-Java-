package SingletonDesignPattern;

public class Caller {

    public static void main(String[] args) {
        
        System.out.println("Hiii Lets starts singlton class object creation ");

        try{
            
          //  SingleTonClass singleTonClassObjectCreationFirstTry = new SingleTonClass(); //Error 

            SingleTonClass singleTonClassObjectCreationSecondTry = SingleTonClass.getSingleTonClassObject();
            System.out.println(singleTonClassObjectCreationSecondTry.name);


            System.out.println("--------------->>>>>>> sepeartion bw both object <<<<<<<<--------------");


            SingleTonClass singleTonClassObjectCreationThiordTry = SingleTonClass.getSingleTonClassObject();
            System.out.println(singleTonClassObjectCreationThiordTry.name);


        }catch(Exception e){
           System.out.println(e);
        }
    }
    
}


/**
 * 
 * 
 Output : 
 * 
Hiii Lets starts singlton class object creation 
Shikhar
--------------->>>>>>> sepeartion bw both object <<<<<<<<--------------
Shikhar


 */
