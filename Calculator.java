import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int x = read.nextInt();
        System.out.print("Enter 2nd number : ");
        int y = read.nextInt();

        int a= add(x,y);
        System.out.println("Addition = "+a);
        int e= sub(x,y);
        System.out.println("Subtraction = "+e);
        int f=mult(x,y);
        System.out.println("Product = "+f);
        double g=div(x,y);
        System.out.println("Division = "+g);
    }// main()

    public static int add(int a, int b){
        int c=a+b;
        return c;

    }
    public static int sub(int c, int d){
        int e=c-d;
        return e;
    }
    public static int mult(int f,int g){
        int h=f*g;
        return h;
    }
    public static double div(double c,double d){
        double g=c/d;
        return g;
    }


}// class
