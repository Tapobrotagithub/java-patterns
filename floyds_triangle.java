import java.util.* ;
public class floyds_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the numbers of lines you want  :") ;
        int lines = sc.nextInt() ;
        int n = 1 ;
        for(int i=1 ; i<=lines ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(n+" ");
                n++ ;
            }
            for(int k=1 ; k<=lines-i ; k++){
               System.out.print(" ") ;   
            }
            System.out.println("") ;
        }

        sc.close() ;
    }
    
}
