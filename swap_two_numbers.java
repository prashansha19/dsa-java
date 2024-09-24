public class Main {
    public static void main(String[] args) {
        //Two numbers to be swapped
        int a=10;
        int b=20;
        System.out.println("Before");
        System.out.println("First Number="+a);
        System.out.println("Second Number="+b);
        //swapping
        a=a-b;
        b=a+b;
        a=b-a;
        //printing swapped numbers
        System.out.println("After");
        System.out.println("First Number="+a);
        System.out.println("Second Number="+b);
    }
}
