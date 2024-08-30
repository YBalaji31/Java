import java.util.*;

class dp8{
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
if(array[0][0]==0){
res[0][0]=1;
}
for(i=1;i<col;i++)
{
if(array[0][i]==0){
res[0][i]=1;
}
}

for(i=1;i<row;i++)
{
if(array[i][0]==0){
res[i][0]=1;
}
}

for(i=1;i<row;i++){
for(j=1;j<col;j++){

if(array[i][j]==0){
res[i][j]=res[i-1][j]+res[i][j-1];
}
}
}
System.out.println(res[row-1][col-1]);


}
}