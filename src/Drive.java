public interface Drive {
    public default void driveTheCar() {
        System.out.println("drive the car");
    }

    public default void stopTheCar(){
        System.out.println("stop the car");
    }
}
