import java.util.*;
class matrix15{

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

for(i=1;i<row;i++){

for(j=1;j<col;j++){
if(array[i][j]!=array[i-1][j-1]){
System.out.println("False");
System.exit(0);
}

}

}

System.out.println("True");
}
}