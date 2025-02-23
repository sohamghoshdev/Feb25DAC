import java.util.Scanner;

class area{
public static void main (String args[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter Radius : ");
int r = input.nextInt();
double area = 3.142 * r * r;
System.out.print("Area Is : " + area);
input.close();
}
}