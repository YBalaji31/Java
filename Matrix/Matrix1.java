import java.util.*;

class matrix1{
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
	
	int ind1=-1,ind2=-1;
	for(i=0;i<row;i++){
		int mini=Integer.MAX_VALUE;
		for(j=0;j<row;j++){
			if(mini>array[i][j]){
				mini=array[i][j];
				ind1=i;
				ind2=j;
			}
		}
		boolean flag=true;
		for(k=0;k<col;k++){
			if(array[ind1][ind2]<array[k][ind2])
			{
				flag=false;
			}
		}
		if(flag){
			System.out.println();
			System.out.println(array[ind1][ind2]);
		}
		
	}



} 
}