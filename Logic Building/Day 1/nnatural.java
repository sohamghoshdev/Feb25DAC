import java.util.Scanner;

class nnatural{
    public static void main(String args[]) {
Scanner input = new Scanner(System.in);
System.out.print("Enter Limit: ");
int limit = input.nextInt();
for(int i=1;i<=limit;i++){
System.out.print(i +" ");
}
input.close();
    }
}
