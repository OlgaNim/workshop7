public abstract class Automobile implements Drive {
    public String carBody;
    public String color;
public Automobile(String carBody, String color) {
    super();
carBody = "exists";
color = "default color";
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
