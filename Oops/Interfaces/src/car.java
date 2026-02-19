public class car implements Engine,Brake,media{
    int a=30;

    @Override
    public void brake() {
        System.out.println("I brake the car");
    }

    @Override
    public void acc() {
        System.out.println("i accelrate the car");
    }

    @Override
    public void start() {
        System.out.println("i start the car");
    }

    @Override
    public void stop() {
        System.out.println("i stop the car");
    }

}
