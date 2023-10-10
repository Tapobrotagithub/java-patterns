import java.util.* ;
public class reverse_star {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter how many lines you want to print :") ;
        int star = sc.nextInt() ;
        for(int i=1 ; i<=star ; i++){
            for(int j=1 ; j<=star-i ;j++){
              System.out.print(" ") ; 
            }
            for(int k=1 ; k<= i ; k++){
               System.out.print("*") ;
            }
            System.out.println("") ;
           

        }


        sc.close() ;
    }

    
}
