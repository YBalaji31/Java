import java.util.*;

class q2{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the string");
String input=sc.next();

System.out.println("Enter the number");
int target=sc.nextInt();

int[] array=new int[26];

for(int i=0;i<input.length();i++){
if(i<input.length()-1 && input.charAt(i)==input.charAt(i+1))
{
array[input.charAt(i)-'a']++;
i++;
continue;
}
array[input.charAt(i)-'a']++;
}

for(int i=0;i<26;i++){
if(array[i]==target){
System.out.print((char)('a'+i)+" ");
}
}
}

}