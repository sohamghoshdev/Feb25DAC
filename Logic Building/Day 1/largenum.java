import java.util.Scanner;

class largenum{
public static void main (String args[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter First Number : ");
int var1 = input.nextInt();
System.out.print("Enter Second Number : ");
int var2 = input.nextInt();
System.out.print("Enter Third Number : ");
int var3 = input.nextInt();
int largest;
if(var1>=var2 && var1>=var3){
largest = var1;
}else if(var2>=var1 && var2>=var3){
largest = var2;
}else{
largest = var3;
}
System.out.print("Largest Is : "+ largest);
input.close();
}
}