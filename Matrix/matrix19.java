import java.util.*;

class matrix19{

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
	System.out.println();
	for(i=0;i<row;i++){
	for(j=0;j<col;j++){
		System.out.print(array[i][j]+"   ");
	}
	System.out.println();
	}
	
}
}
