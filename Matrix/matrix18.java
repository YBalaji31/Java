import java.util.*;

class matrix18{

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
	
	for(i=0;i<row;i++){
	for(j=i;j<col;j++){
		int temp=array[i][j];
		array[i][j]=array[j][i];
		array[j][i]=temp;
	}
	}
	
	for(i=0;i<row;i++){
	int left=0;
	int right=col-1;
	
	while(left<right){
	
	int temp=array[i][left];
	array[i][left]=array[i][right];
	array[i][right]=temp;
	left++;
	right--;
	}
	
	}
	
	
	
	
	System.out.println();
	for(i=0;i<row;i++){
	for(j=0;j<col;j++){
		System.out.print(array[i][j]+"   ");
	}
	System.out.println();
	}
	
}
}
