import java.util.Scanner;

class evenodd{
public static void main (String args[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter Number : ");
int num = input.nextInt();
if(num%2 == 0){
System.out.print("Even Number");
}else{
System.out.print("Odd Number");
}
input.close();
}
}