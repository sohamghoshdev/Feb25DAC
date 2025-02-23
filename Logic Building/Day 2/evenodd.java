import java.util.Scanner;

class evenodd {
public static void main (String args[]){
Scanner inp = new Scanner(System.in);
System.out.print("Enter Number : ");
int number = inp.nextInt();
if (number%2==0){
System.out.print("Even Number");
}else{
System.out.print("Odd Number");
}
}
}