package review.class10;

public class Flowers {
    String color;
    int cl;
    Flowers(String color){
        this.color=color;
    }
    Flowers(int cl){
        this.cl=cl;
    }

    void showColor(){
        System.out.println("Flowers have beautiful colors");
    }
    void smell(){
        System.out.println("flowers smell very good");
    }
    void bloom(){
        System.out.println("They bloom in Spring");
    }
}
class Rose extends Flowers{

    Rose(String color) {
        super(color);
    }
    @Override
    void showColor(){
        System.out.println("Roses have "+color+" colors");
    }
    void bloom(){
        System.out.println("Roses bloom in April");
    }
    void thorns(){
        System.out.println("Please be careFull");
    }
}
class Tulips extends Flowers{


    Tulips(String color) {
        super(color);
    }
    void showColor(){
        System.out.println("It has Blue color");
    }
}
