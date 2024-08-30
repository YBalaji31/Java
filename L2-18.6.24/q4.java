import java.util.*;


class q4{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);

System.out.println("Enter array size");
int num=sc.nextInt();
System.out.println("Enter the array elements");
int[] array=new int[num]; 
for(int a=0;a<num;a++){
	array[a]=sc.nextInt();
}
System.out.println("Enter the target");
int target=0;

int ind=num;

//int[] sum=new 
int[] sum=new int[100];

int temp=0;
System.out.println();
for(int i=0;i<ind;i++){
for(int j=i+1;j<ind;j++){
for(int k=j+1;k<ind;k++){
boolean flag=true;

if(array[i]+array[j]+array[k]==target)
{
	
for(int z=0;z<100;z++)
{
	if(Math.abs(array[i])+Math.abs(array[j])+Math.abs(array[k])==sum[z])
	{
		flag=false;
		break;
	}
}

sum[temp]=Math.abs(array[i])+Math.abs(array[j])+Math.abs(array[k]);
temp++;

if(flag){
System.out.println(array[i]+"\t"+array[j]+"\t"+array[k]);
}
}

}
}
}

}
}