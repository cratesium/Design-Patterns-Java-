package FinalFixedSingletonPattern;

public class MainClassItIsSingleton {
    public static MainClassItIsSingleton singletonObj;
    private MainClassItIsSingleton(){
        if (singletonObj!=null){
            throw new RuntimeException("Trying to break the Singeton pattern");
        }

    }

    public static MainClassItIsSingleton getSingletonObj(){
        if (singletonObj==null){
            synchronized (MainClassItIsSingleton.class){
                if (singletonObj==null){
                    singletonObj = new MainClassItIsSingleton();
                }

            }
        }
        return  singletonObj;
    }



}
