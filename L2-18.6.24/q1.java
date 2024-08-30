import java.util.*;
class q1{

public static void main(String [] args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int space =num-1;

int i,j,k;

for(i=1;i<=num;i++){
	
for( k=1;k<=space;k++){
	System.out.print(" ");
	}
	
space--;
for(j=1;j<=i;j++){
System.out.print('*'+" ");
}
System.out.println();
}


System.out.println();
System.out.println();
int spaces=num/2;

for(i=1;i<=num/2+1;i++){
for( k=1;k<=spaces;k++){
	System.out.print(" ");
	}
	
spaces--;
for(j=1;j<=i;j++){
System.out.print('R'+" ");
}
System.out.println();
}

spaces=1;

for(i=1;i<=num/2+1;i++){
for( k=1;k<=spaces;k++){
	System.out.print(" ");
	}
	
spaces++;
for(j=num/2;j>=i;j--){
System.out.print('R'+" ");
}
System.out.println();
}	
	
	
}


}