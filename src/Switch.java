public interface Switch {

    public default void startTheEngine() {
        System.out.println("start the engine");
    }
    public default void turnOffTheEngine() {
        System.out.println("turn off the engine");
    }
}
