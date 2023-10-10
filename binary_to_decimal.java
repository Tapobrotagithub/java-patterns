import java.util.* ;
public class binary_to_decimal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the binary number you want convert to decimal :") ;
        int binary = sc.nextInt() ;
        int remainder ;
        int decimal = 0;
        int i = 0 ;
        while(binary !=0){
            if(binary%10 == 1 || binary%10 ==0){
            remainder = binary % 10 ;
            decimal = decimal + remainder * (int)Math.pow(2,i) ;
            i++ ;
            binary = binary /10 ;
            }
            else{
                 System.out.println("Your entered number is not a binary number ") ;
                 break ;
            }
        }
        System.out.println("Decimal : "+ decimal);
        sc.close() ;
    }

}