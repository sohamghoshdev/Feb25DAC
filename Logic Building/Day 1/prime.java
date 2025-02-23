import java.util.Scanner;

class prime {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();

        boolean isPrime = true;
	
	if(num<=1){
	isPrime=false;
}else if(num==2){
	isPrime=true;
}else if(num%2==0){
	isPrime=false;
}else{
for (int i =3;i<=num;i++){
	if(num%i==0){
isPrime=false;

break;
}
}
}

if (isPrime) {
 	System.out.println(num + " is a Prime Number.");
} else {
 	System.out.println(num + " is Not a Prime Number.");
}
 input.close();
    }
}
