import java.util.Scanner;

class countdigit{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter Number : ");
int num = input.nextInt();
int count=0;
do{
num=num/10;
count++;
}while(num>0);
System.out.print("Digit Count : "+ count);
input.close();
}
}