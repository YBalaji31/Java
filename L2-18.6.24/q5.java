import java.util.*;

class q5{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
if(num==0){
	System.out.println("The result is "+0);
	System.exit(0);
	
	
}
if(num%9==0){
	System.out.println("The result is "+9);
}
else{
	System.out.println("The result is "+num%9);	
}
}
}