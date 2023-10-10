import java.util.* ;
class pyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter how many lines you want to print :") ;
        int star = sc.nextInt() ;
        for(int i = 1;i <= star;i++){
            for(int j =1 ; j<=star-i ; j++){
                System.out.print(" ");
            }
            int j=1 ;
            while(j <= 2*i -1){
                System.out.print("*");
                j++ ;
            }
            System.out.println("");
        }
        sc.close() ;



    }

}
