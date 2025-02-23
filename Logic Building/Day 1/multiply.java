import java.util.Scanner;

class multiply{
public static void main (String args[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter First Number : ");
int var1 = input.nextInt();
System.out.print("Enter Second Number : ");
int var2 = input.nextInt();
int mul = var1*var2;
System.out.print("Multiplication Is : " + mul);
input.close();
}
}