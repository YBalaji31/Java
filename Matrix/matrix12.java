import java.util.*;

class matrix12{

static int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
public static void dfs(int x,int y,int[][] array){

	array[x][y]=0;
	
	for(int[] dirs:directions){
	
	int dx=x+dirs[0];
	int dy=y+dirs[1];
	
	if(dx>=0 && dy>=0 && dx<array.length && dy<array[0].length && array[dx][dy]!=0){
	dfs(dx,dy,array);
	}
	}

}


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
	int count=0;
	for(i=0;i<row;i++)
	{
	for(j=0;j<col;j++){
	if(array[i][j]==1){
	dfs(i,j,array);
	count++;
	}
	}
	}
	System.out.println();
System.out.println("The number of island is "+count);
}

}