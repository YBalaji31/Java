import java.util.*;

class dp6{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the row size");
int row=sc.nextInt();

int i,j,k;

int[] array=new int[row+1];



array[0]=1;
array[1]=1;

for(i=2;i<=row;i++){
array[i]=array[i-1]+array[i-2];
}

System.out.println(array[row]);


}
}