package SingletonDesignPattern.NotThreadSafeButfast;

public class SingleTonClassV2NotThreadSafe {
    String name;

    // EAGER INITIALIZATION - object gets created when the class is loaded
    // This is the eager way - object is created at class load time
    private static SingleTonClassV2NotThreadSafe singleTonObj = new SingleTonClassV2NotThreadSafe();

    private SingleTonClassV2NotThreadSafe() {
        this.name = "Shikhar";
    }

    /**
     * EAGER INITIALIZATION - object is already created when class is loaded
     * @return the singleton instance
     */
    public static SingleTonClassV2NotThreadSafe getObject() {
        return singleTonObj;
    }
}

