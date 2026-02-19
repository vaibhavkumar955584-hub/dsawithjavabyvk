
public class NiceCar {
    private Engine engine;
    private media player= new CDPlayer();
    public NiceCar(){
        engine=new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }
    public void stop(){
        engine.stop();
    }
    public void start(){
        engine.start();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upgradeEngine(){
        this.engine=new ElectricEngine();
    }
}
