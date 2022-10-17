import java.util.Scanner;
class factorial{
public static void printFactorial(int n){
    int fact = 1;                 //// initilizing factorial = 1
    if(n < 0){               // here we are excluding negative values
        System.out.println(" Invalid number");
        return;
    }
    for(int i = n; i >=1; i--){     
         fact = fact * i;        // here we are clculating factorial 
    }
    System.out.println(fact);   
    return;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printFactorial(n);   // printing the factorial

    }
}
