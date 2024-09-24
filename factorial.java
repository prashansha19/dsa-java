import java.util.*;
public class Main {
    //Factorial of any number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Inputting the number 
        int n=sc.nextInt();
        int res=1;
        for(int i=1; i<=n; i++){
            res *= i;
        }
        //printing the factorial
        System.out.println("Factorial of "+n+" is = "+res);
    }
}
