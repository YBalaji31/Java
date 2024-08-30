import java.util.*;
class matrix7{

public  static void main(String[] args){

Scanner sc=new Scanner(System.in);

int row=sc.nextInt();
int col=sc.nextInt();
int i,j;
int[][] array=new int[row][col];

for(i=0;i<row;i++){
for(j=0;j<col;j++){
array[i][j]=sc.nextInt();
}
}
System.out.println();
int count=0;
int[][] dp=new int[row][col];
for(i=0;i<row;i++){
	dp[i][0]=array[i][0];
	count+=dp[i][0];
}

for(i=0;i<col;i++){
	dp[0][i]=array[0][i];
	count+=dp[0][i];
}

for(i=1;i<row;i++){
	for(j=1;j<col;j++){
		if(array[i][j]==1){
			dp[i][j]=Math.min(dp[i][j-1],Math.min(dp[i-1][j-1],dp[i-1][j]))+1;
			count+=dp[i][j];
		}
	}
}

for(i=0;i<row;i++){
	for(j=0;j<col;j++){
		
		System.out.print(dp[i][j]+" ");
	}
	
	System.out.println();
}
System.out.println();
System.out.println("Number of submatrix "+count);
}

}
