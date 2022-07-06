package review.class10;

public class FlowersTest {
    public static void main(String[] args) {
        Rose rose =new Rose("Green");
        rose.bloom();
        rose.showColor();
        rose.smell();
        System.out.println("++++++++++++++++++++++++++++++++");
        Flowers flowers=new Rose("Green");
        flowers.bloom();
        flowers.showColor();
        flowers.smell();
        Rose rose1=(Rose)flowers;
        rose1.thorns();
        //flowers.thorns(); not possible because it is only inside the child class
        Flowers[] flowers1={new Rose("Red"), new Tulips("Green")};
        System.out.println("++++++++++++++++++++++++++++++++");
        for (Flowers flowers2 : flowers1) {
            flowers2.smell();
            flowers2.showColor();
            flowers2.bloom();
        }
    }
}
