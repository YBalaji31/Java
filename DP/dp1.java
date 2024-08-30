/*Maximum size square sub-matrix with all 1s

Given a binary matrix, find out the maximum size square sub-matrix with all 1s.

For example, consider the below binary matrix.

0 1 1 0 1
1 1 0 1 0
0 1 1 1 0
1 1 1 1 0
1 1 1 1 1
0 0 0 0 0 */

import java.util.*;

class dp1{
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

for(i=0;i<col;i++)
{
res[0][i]=array[0][i];
}

for(i=0;i<row;i++)
{
res[i][0]=array[i][0];
}

for(i=1;i<row;i++){
for(j=1;j<col;j++){

if(array[i][j]==1){
res[i][j]=Math.min(res[i-1][j-1],Math.min(res[i-1][j],res[i][j-1]))+1;
}
else{
res[i][j]=0;
}
}
}

System.out.println("qwertyuiop");

int maxi=-1,maxj=-1;
int max=Integer.MIN_VALUE;

for(i=0;i<row;i++){
for(j=0;j<col;j++){
if(max<res[i][j]){
max=res[i][j];
maxi=i;
maxj=j;
}
}
}

for (i = maxi; i > maxi - max; i--) {
            for (j = maxj; j > maxj - max; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

}
}