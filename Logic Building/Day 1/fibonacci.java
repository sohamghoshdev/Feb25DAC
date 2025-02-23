import java.util.Scanner;

class fibonacci{
public static void main (String args[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter The Limit : ");
int limit = input.nextInt();
int first = 0, second = 1;
System.out.print("Fibonacci Series : "+ first +" " + second);
for(int i=3;i<=limit;i++){
int next = first + second;
System.out.print(" " + next );
first = second;
second = next;
}
input.close();
}
}