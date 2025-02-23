import java.util.Scanner;

class swap{
public static void main (String args[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter First Number : ");
int var1 = input.nextInt();
System.out.print("Enter Second Number : ");
int var2 = input.nextInt();
System.out.println(" First : " + var1+ ", " + " Second : " + var2);
var1 = var1 + var2;
var2 = var1 - var2;
var1 = var1 - var2;
System.out.println(" After Swapping ");
System.out.print(" First : " + var1+ ", " + " Second : " + var2);
input.close();
}
}