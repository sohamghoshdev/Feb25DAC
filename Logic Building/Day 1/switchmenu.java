import java.util.Scanner;

class switchmenu{
public static void main (String args[]){
Scanner input = new Scanner(System.in);
int choice;

while(true){
System.out.println("---------Menu---------");
System.out.println("1. Sum");
System.out.println("2. Multiplication");
System.out.println("3. Subtraction");
System.out.println("4. Division");
System.out.println("5. Remainder");
System.out.println("6. Exit");
System.out.print("Enter Your Choice.....");

choice = input.nextInt();

 if (choice == 6) {
                System.out.print("Exiting program...");
                break;
            	}

System.out.print("Enter First Number : ");
int var1 = input.nextInt();
System.out.print("Enter Second Number : ");
int var2 = input.nextInt();

switch(choice){
case 1:
	System.out.println("Sum : " + (var1 + var2));
	break;
case 2:
	System.out.println("Multiplication : " + (var1 * var2));
	break;
case 3:
	System.out.println("Substraction : " + (var1 - var2));
	break;
case 4:
	if(var2!=0){
	System.out.println("Division : " + (var1/var2));
		   }else{
	System.out.println("Division By Zero Not Allowed");	
	     }
	break;
case 5:
	if(var2!=0){
	System.out.println("Remainder : " + (var1%var2));
		   }else{
	System.out.println("Modulo By Zero Not Allowed");	
	     }
	break;
default:
	System.out.println("Invalid Choice ! Select Valid Option");
}
}
}
}