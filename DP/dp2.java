import java.util.*;

class dp2{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the row size");
int row=sc.nextInt();
System.out.println("Enter the col size");
int col=sc.nextInt();
int i,j,k;

int[][] array=new int[row][col];

for(i=0;i<row;i++){
for(j=0;j<col;j++){

array[i][j]=sc.nextInt();

}
}

int[][] res=new int[row][col];
res[0][0]=array[0][0];
for(i=1;i<col;i++)
{
res[0][i]=res[0][i-1]+array[0][i];
}

for(i=1;i<row;i++)
{
res[i][0]=res[i-1][0]+array[i][0];
}

for(i=1;i<row;i++){
for(j=1;j<col;j++){

res[i][j]=Math.min(res[i-1][j-1],Math.min(res[i-1][j],res[i][j-1]))+array[i][j];

}
}
System.out.println(res[row-1][col-1]);


}
}