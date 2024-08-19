public class Butterfly {
    public static void butter(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //no of stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces print
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            //stars print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        
        // 2nd half
        for(int i=n;i>=1;i--){
            //stars print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces print
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        butter(4);
    }
}
