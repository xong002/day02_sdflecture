package sg.edu.nus.iss;

public class MountainBike extends Bicycle{
    
    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMountainBike [seatHeight=" + seatHeight + "]";
    }

}
