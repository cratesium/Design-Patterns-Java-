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


            //either compare the hash code 
            System.out.println(singleTonClassObjectCreationSecondTry.hashCode());
            System.out.println(singleTonClassObjectCreationThiordTry.hashCode());



              if (singleTonClassObjectCreationSecondTry.hashCode()==singleTonClassObjectCreationThiordTry.hashCode()) {
                System.out.println("Both Object at the end are same for lazy way  ");
        
            }


            /// EAGER WAY OF CREATING with v2 : created at class load time - object gets created , may be used , may not be , may reduce the performacne 
            
            SingleTonClassV2 firstObject = SingleTonClassV2.getObject();
            SingleTonClassV2 secondObject =SingleTonClassV2.getObject();

            System.out.println(firstObject.hashCode());
            System.out.println(secondObject.hashCode());

            if (firstObject.hashCode()==secondObject.hashCode()) {
                System.out.println("Both Object at the end are same for v2 for eager way   ");
        
            }
            


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
622488023
622488023
 */
