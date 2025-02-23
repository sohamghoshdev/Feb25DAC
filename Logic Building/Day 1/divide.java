import java.util.Scanner;

class divide{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter Dividend Number : ");
int var1 = input.nextInt();
System.out.print("Enter Divisor Number : ");
int var2 = input.nextInt();
int qut = var1/var2;
System.out.print("Quotient Is : " + qut);
input.close();
}
}