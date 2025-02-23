import java.util.Scanner;

class temperature{
    public static void main(String args[]) {
Scanner input = new Scanner(System.in);
System.out.print("Enter Temperature in Celsius : ");
double celc = input.nextInt();
double far = (celc * 9/5) + 32;
System.out.print("Temperature in Fahrenheit : "+far);
input.close();
    }
}
