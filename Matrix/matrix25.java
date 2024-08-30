import java.util.*;

class matrix25{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int col=sc.nextInt();
	
	int i,j,k;
	int[][] array=new int[row][col];
	for(i=0;i<row;i++){
		for(j=0;j<col;j++)
		{
			array[i][j]=sc.nextInt();
		}		
	}
	
	int num=array[0].length;
	
	for(i=0;i<row;i++){
		int temp=0;
	for(j=0;j<col;j++){
		temp+=array[i][j];
	}
	if(temp!=(((num)*(num+1))/2))
	{
	System.out.println("FALSE");
	System.exit(0);
	}
	}
	
System.out.println("TRUE");	
}
}
