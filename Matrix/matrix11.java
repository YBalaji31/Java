import java.util.*;
class matrix11{

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

int k=0,m=0;
int l=row-1,n=col-1;

while(k<=l && m<=n){

for(i=m;i<=n;i++){
	System.out.print(array[k][i]+" ");
}
k++;

for(i=k;i<=l;i++){
	System.out.print(array[i][n]+" ");
}
n--;

for(i=n;i>=m;i--){
	System.out.print(array[l][i]+" ");
}
l--;
for(i=l;i>=k;i--){
	System.out.print(array[i][m]+" ");
}
m++;
}


}

}
