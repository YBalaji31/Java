import java.util.*;

class q3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the row");
int row=sc.nextInt();

System.out.println("Enter the col");
int col=sc.nextInt();

int[] array=new int[row*col];

for(int i=0;i<row*col;i++){
	array[i]=sc.nextInt();
}

int max=Integer.MIN_VALUE,count=0;
for(int k=0;k<row*col;k++){
	if(k+1%col==0){
		if(max<count){
			max=count;
			row=k+1/col;
			count=0;
		}
	}
	if(array[k]==1){
		count++;
	}
}
System.out.println("The row which hase more no of 1 is  "+row);
}
}