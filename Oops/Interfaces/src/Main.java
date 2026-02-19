
public class Main {
    public static void main(String[] args) {
       // to run the elctric car
//        ElectricEngine car=new ElectricEngine();
//        car.acc();
//        car.start();
//        car.stop();
        //to run the car
//        Engine car1=new car();
//        car1.acc();
//        car1.start();
//        car1.stop();
//
        // to play music
//        CDPlayer carMedia= new CDPlayer();
//        carMedia.stop();
//        carMedia.start();

        //by  createing new class combining all the feature of music and engines
        NiceCar car1=new NiceCar();
        car1.start();
car1.upgradeEngine();
car1.startMusic();
        car1.stop();
         car1.stopMusic();



    }
}
