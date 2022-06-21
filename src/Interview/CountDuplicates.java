package Interview;

public class CountDuplicates {
    //how to count Duplicates
    public static void main(String[] args) {
        int [] arr={20,20,34,47,30,30};
        countDup(arr);


    }
    static void countDup(int [] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for( int y=1+i; y<arr.length; y++){
                if (arr[i]==arr[y]) {
                   count++;
                }
            }
        }
        System.out.println(count);
    }

}
