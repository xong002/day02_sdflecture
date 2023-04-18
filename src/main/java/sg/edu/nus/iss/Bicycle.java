package sg.edu.nus.iss;

public class Bicycle implements Startable{
    public int gear;
    public int speed;


    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
    }

    public int getGear() {
        return gear;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void applyBrake(int decreaseValue){
        speed -= decreaseValue;
    }
     
    public void speedUp(int increaseValue){
        speed += increaseValue;
    }
}
