package review.class10;

public interface Sellable {
    void sell();

}
interface Chargeable extends Sellable{
    void charge();
}
class Laptop implements Sellable, Chargeable {
    @Override
    public void sell() {
        System.out.println("You can sell tmem");
    }

    @Override
    public void charge() {
        System.out.println("You can charge");
    }
}

