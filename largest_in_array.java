import java.util.*;
// large number in array

public class largest_in_array {
    public static void getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;  //-infinity
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static int main(String args[]){
        int numbers[]={1,2,4,5,6,8};
        System.out.println("largest value is:"+getlargest(numbers));
        System.out.println("largest value is:"+getlargest(new int[]{1,2,4,5,6,8}));
        
    }
}
