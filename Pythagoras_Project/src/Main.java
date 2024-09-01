import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        double x, y, z;

        Scanner maths = new Scanner(System.in);

        System.out.println("Enter Side x: ");
        x = maths.nextDouble();

        System.out.println("Enter Side y: ");
        y = maths.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("Hypotenuse is: "+z);

        maths.close();
    }
}