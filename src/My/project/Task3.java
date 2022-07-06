package My.project;

public class Task3 {
    //Create a Class Vehicle that would have the following fields:
    // vehiclePrice and method calculateSalePrice() which should be returning a price of the Vehicle.
    //Create 2 sub classes: Sedan and Truck.
    // The Truck class has field as weight and has
    // its own implementation of  calculateSalePrice() method in which returned price calculated as following:
    // if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
    //The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
    // if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
}
interface Vehicle{
    double vehiclePric=0;
    double calculateSalePrice();
    }


class Truck implements Vehicle{
    double weight;
    double price;

    public Truck(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    @Override
    public double calculateSalePrice() {
        double discount;
        if (weight>2000){
            discount=(.1*price);
        }else{
            discount=(.2*price);
        }
        return (price-discount);
    }
}
class Sedan implements Vehicle{
    double length;
    double price;

    public Sedan(double length, double price) {
        this.length = length;
        this.price = price;
    }

    @Override
    public double calculateSalePrice() {
        double discount;
        if(length>20){
          discount=(.05*price);
        }else{
            discount=(.1*price);
        }
        return (price-discount);
    }
}
class Test3{
    public static void main(String[] args) {
        Truck t=new Truck(6000, 40000);
        System.out.println("The truck sale price = "+t.calculateSalePrice());
        Sedan s=new Sedan(19, 24000);
        System.out.println("The sedan sale price = "+s.calculateSalePrice());

    }}
