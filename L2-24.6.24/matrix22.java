import java.util.*;

class matrix22{

public static boolean checkwinner(char[][] xox,flag){
	char check='O';
	if(flag){
		check='X';
	}
	int left=0;right=2;
	int diag1=0;diag2=0;
	for(int i=0;i<3;i++){
		
		for(int j=0;j<3;j++){
			if(xox[i][j].equals(check))
				row++;	
		}
		if(xox[i][left].equals(check)){
			diag1++;
			left++;
		}
		if(xox[i][right].equals(check)){
			diag1++;
			right++;
		}	
	}
	if(row==3){
			return true;
		}
	if(diag1==3){
			return true;
		}
	if(diag2==3){
			return true;
		}
	for(int k=0;i<col;k++){
		for(int l=0;l<row;l++){
			if(xox[k][l].equals(check))
				col++;	
		}
	}
	if(col==3)
		return true;
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
	
	char[][] xox=new char[row][2];
	
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
		if(checkwinner(xox,!flag)){
			if(!flag){System.out.println('A');}
			else{System.out.println('B')};
		}
	}
	
	
}
}
