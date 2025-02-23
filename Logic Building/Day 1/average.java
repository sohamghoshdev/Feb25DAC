import java.util.Scanner;

class average{
public static void main (String args[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter First Number : ");
int var1 = input.nextInt();
System.out.print("Enter Second Number : ");
int var2 = input.nextInt();
System.out.print("Enter Third Number : ");
int var3 = input.nextInt();
int average = (var1+var2+var3)/3;
System.out.print("Enter Third Number : ");
input.close();
}
}