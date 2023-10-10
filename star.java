import java.util.Scanner;

public class star {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter how many lines you want to print :") ;
        int star = sc.nextInt() ;
        for(int i=1 ; i<=star ; i++){
            for(int j=1 ;j<=i ; j++){
                System.out.print("*") ;
            }
            System.out.println() ;


        }
        sc.close() ;
    }

   
}
