import java.util.Scanner;

class power{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int base = input.nextInt();
System.out.print("Enter Exponent : ");
        int expo = input.nextInt();
int result=1;
for(int i=0;i<expo ;i++){
result *= base;
}        
System.out.print("Result Is: "+result);
 input.close();
    }
}
