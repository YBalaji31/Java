import java.util.*;

class matrix22{

public static boolean checkwinner(char[][] xox,boolean flag){
	for(int a=0;a<3;a++){
		for(int b=0;b<3;b++){
			System.out.print(xox[a][b]+" ");
		}
		System.out.println();
	}
	char check='O';
	if(flag){
		check='X';
	}
	int left=0,right=2;
	int row=0,col=0;
	int diag1=0,diag2=0;
	for(int i=0;i<3;i++){
		row=0;
		for(int j=0;j<3;j++){
			if(xox[i][j]==check)
				row++;	
		}
		if(xox[i][left]==check){
			diag1++;
			left++;
		}
		if(xox[i][right]==check){
			diag2++;
			right--;
		}	
	}
	if(row==3){
		//System.out.println(1);
			return true;
		}
	if(diag1==3){
		//System.out.println(2);
			return true;
		}
	if(diag2==3){
			//System.out.println(3);
			return true;
		}
	for(int k=0;k<col;k++){
		col=0;
		for(int l=0;l<row;l++){
			if(xox[k][l]==check)
				col++;	
		}
		if(col==3){
	System.out.println(4);
	return true;
	}
	}
	
	return false;

	
}

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int col=sc.nextInt();
	
	int i,j,k;
	int[][] array=new int[row][2];
	for(i=0;i<row;i++){
		for(j=0;j<2;j++)
		{
			array[i][j]=sc.nextInt();
		}		
	}
	
	char[][] xox=new char[3][3];
	boolean flag=true;
	for(i=0;i<3;i++){
	for(j=0;j<3;j++){
		xox[i][j]='-';
	}
	}
	
	for(i=0;i<row;i++){
		int x=array[i][0];
		int y=array[i][1];
		if(flag){
			xox[x][y]='X';
			flag=!flag;
		}
		else{
			xox[x][y]='O';
			flag=!flag;
		}
		System.out.println();
		System.out.println();
		if(checkwinner(xox,!flag)){
			if(!flag){
				System.out.println('A');
			System.exit(0);
			}
			else{
				System.out.println('B');
				System.exit(0);
				}
		}
	}
	
System.out.println("Draw");	
}
}
