import java.util.*;
class matrix27{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

int row=sc.nextInt();
int col=sc.nextInt();

int[][] array=new int[row][col];

int i,j;
for(i=0;i<row;i++){
for(j=0;j<col;j++){
array[i][j]=sc.nextInt();
}
}
System.out.println();

for(i=0;i<row;i++){
	int count1=0,count2=0;
	int x=-1,y=-1;
	for(j=0;j<col;j++){
		if(array[i][j]==1)
		{
			x=i;
			y=j;
			count1++;
		}
		}
	if(count1==1){
		for(int k=0;k<row;k++){
			if(array[k][y]==1)
			{
				count2++;
			}
			
		}
	}
	if(count2==1){
		System.out.println(x+" "+y);
	}
}
}
}