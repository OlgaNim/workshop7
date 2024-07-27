public abstract class Automobile implements Drive {
    public String carBody;
    public String color;
public Automobile(String carBody, String color) {
//    super();
//carBody = "exists";
//color = "default color";
}

    public static void aboutCarBody(String carBody) {
        System.out.println(carBody);
    }

    public static void aboutCarColor(String color) {
        System.out.println(color);
    }



    public class Engine implements Switch {


        @Override
        public void startTheEngine() {

        }

        @Override
        public void turnOffTheEngine() {

        }
    }

    @Override
    public void driveTheCar() {

    }

    @Override
    public void stopTheCar() {

    }


}
