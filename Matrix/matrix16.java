import java.util.*;

class matrix16{

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
	
	int left=0;
	int right=array[0].length-1;
	int sum=0;
	for(i=0;i<row;i++)
	{
	
	if(left==right)
	{
	sum+=array[i][left];
	left++;
	right--;
	continue;
	}
	sum+=array[i][left]+array[i][right];
	left++;
	right--;
	}
	System.out.println();
System.out.println("The sum of diagnol is "+sum);
}
}
