import java.util.*;
class pattern{
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
        for(int line=1;line<=4;line++){
            for(int star=1;star<=4-line+1;star++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
