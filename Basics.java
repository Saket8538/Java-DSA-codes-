import java.util.*;
public class Basics{
    public static void main(String args[]){
        try (Scanner sc=new Scanner(System.in)){
            do{
                System.out.println("Enter your number");
                int number=sc.nextInt();
                int reverse = 0;
                int temp = number;
                while(temp != 0) {
                    int digit = temp % 10;
                    reverse = reverse * 10 + digit;
                    temp /= 10;
                }
                if(reverse == number){
                    System.out.println(number);
                    break;
                }
                System.out.println(number);
            }
            while(true);
        }
    }
}