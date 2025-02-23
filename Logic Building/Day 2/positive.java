import java.util.Scanner;

class positive {
public static void main (String args[]){
Scanner inp = new Scanner(System.in);
System.out.print("Enter Number : ");
int number = inp.nextInt();
if (number>=0){
System.out.print("Positive Number");
}else{
System.out.print("Negative Number");
}
}
}