import java.util.*;
public class Main {
    //to print the Fibonacci series
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //inputting the number till where the Fibonacci series is to be printed
        int count=sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);
        for(int i=1; i<count ;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
