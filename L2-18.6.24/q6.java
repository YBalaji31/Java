import java.util.*;

class q6{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int num=sc.nextInt();

int sum=0;
int temp=num;
int count=0;

while(count<100){
	sum=0;
	count++;
while(temp!=0){
sum+=(temp%10)*(temp%10);
temp=temp/10;
}
if(sum==1){
System.out.println("It is a happy number");
System.exit(0);
}
temp=sum;
}
System.out.println("It is not a happy number");
}
}