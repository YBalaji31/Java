import java.util.*;

class q2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String string=sc.next();

int star=0,hash=0;
for(int i=0;i<string.length();i++){
	if(string.charAt(i)=='*'){
	
	star++;
	}
	else{
	hash++;
	}
}
if(star==hash){
System.out.println("Equal");
}
else
System.out.println("Difference is "+(star-hash));
}
}