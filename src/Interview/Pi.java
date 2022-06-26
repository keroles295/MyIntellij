package Interview;

public class Pi {
    public static void main(String[] args) {
        String str = "abcdABCD";
        boolean result = str.matches("[a-zA-Z]+");
        System.out.println("Original String : " + str);
        System.out.println("Does string contain only Alphabets? : " + result);
    }
}
