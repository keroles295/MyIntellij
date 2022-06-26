package Interview;

public class Main {

    public static void main(String [] args){
        Main p= new Main("Eggs", 3.0, "Produce", true, 10);

    }
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;
    Main(String label, double price, String category, boolean hasExpiration, int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);

    }
    Main(String label, double price, int stock){
        String category="misc";
        boolean hasExpiration=false;
        this.label=label;
        this.price=price;
        this.stock=stock;

    }
    Main(String label, double price){
        String category="";
        boolean hasExpiration=false;
        this.label=label;
        this.price=price;
        int stock=0;

    }



}
