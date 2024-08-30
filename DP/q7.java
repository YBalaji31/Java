import java.util.*;

class q7{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
String s=sc.next();

int[] array=new int[2];int 
ind=0;
String str="";
for(int i=0;i<s.length();i++){
	if(s.charAt(i)==':'){
		array[ind]=Integer.parseInt(str);
		str="";
		ind++;
		continue;
	}
	str+=s.charAt(i);
}

array[ind]=Integer.parseInt(str);
float f = Math.abs((30 * array[0]) - (5.5f * array[1]));

if(f>180){
	f=360-f;
}

System.out.println(f);

}
}