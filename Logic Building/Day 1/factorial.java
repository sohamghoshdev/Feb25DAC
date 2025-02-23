import java.util.Scanner;

class factorial{
public static void main (String args[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter Number : ");
int num = input.nextInt();
int fact = 1;
for(int i=1;i<=num;i++){
fact = fact*i;
}
System.out.print("Factorial Is : " + fact);
input.close();
}
}