import java.util.*;

class q3{
public static void  main(String[] args){

Scanner sc=new Scanner(System.in);

String[] target={"one","two","three","four","five","six","seven","eight","nine","ten"};

System.out.println("Enter the string");
String input=sc.next();

int[] arr=new int[26];
for(int i=0;i<input.length();i++){
arr[input.charAt(i)-'a']++;
}

System.out.println();
for(int j=0;j<target.length;j++)
{
	int count=0;
for(int k=0;k<target[j].length();k++)
{
if(arr[target[j].charAt(k)-'a']>0)
{
count++;
}
}
if(target[j].length()==count)
{
System.out.println(target[j]);
}
}


}

}