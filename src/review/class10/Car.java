package review.class10;

public abstract class Car {
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    abstract void park();
    void start(){
        System.out.println("Push the button to start");
    }
}
 class BMW extends Car{
     public BMW(String make, String model) {
         super(make, model);
     }

     @Override
     void park() {
         System.out.println("Use my auto Parking");
     }
 }