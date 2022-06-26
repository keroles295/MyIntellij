package review.class09;

public class Bicycle {
    String make;
    int gears;
    int maxSpeed;
    void drive(){
        System.out.println("It is time to drive Bicycles");
    }
    void applyBreaks(){
        System.out.println("Applying breaks");
    }

    public Bicycle(String make, int gears, int maxSpeed) {
        this.make = make;
        this.gears = gears;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "make='" + make + '\'' +
                ", gears=" + gears +
                ", maxSpeed=" + maxSpeed +
                '}';




    }
}
class MountainBike extends  Bicycle{
    boolean suspension=true;
    int seatHeight;

    public MountainBike(String make, int gears, int maxSpeed, int seatHeight) {
        super(make, gears, maxSpeed);
        this.seatHeight=seatHeight;
    }

    void setSeatHeight(int seatHeight){
        this.seatHeight=seatHeight;

    }
}
class Test{
    public static void main(String[] args) {
        Bicycle bike=new Bicycle("Trek", 4, 34);
        Bicycle bike2=new Bicycle("Trek", 4, 34);
        System.out.println(bike==bike2);//we should never use == to compare non-primitive data type.
        System.out.println(bike.equals(bike2));
        //System.out.println(bike);
    }
}
