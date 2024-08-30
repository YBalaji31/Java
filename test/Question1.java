class Question1{

public static void main(String[]args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the array dimensions");
int row=sc.nextInt();
int col=sc.nextInt();

int value=(((col)*(col+1))/2);

int[][]mat=new int[row][col];

for(int i=0;i<row;i++){
	int colval=0;
for(int j=0;j<col;j++){

colval+=mat[i][j];
}
if(colval!=val){
	System.out.println("False");
	System.exit(0);
}
}

System.out.println("True");
}
}