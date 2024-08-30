import java.util.*;

class test{
	
	public static void find(int ind,int[] array,int num,String str){
		//System.out.println("value "+array[ind]+" num "+num);
		if(ind==array.length){
			if(num==0){
				System.out.println(str);
				return;
				}
			return;
		}
		
		
			str+=""+array[ind]+" ";
			find(ind+1,array,num-array[ind],str);
			str=str.substring(0,str.length()-2);
	
		find(ind+1,array,num,str);
	}
	
	public static void main(String[] args){
		
		int[] array={2,3,7,6,8};
		int num=10;
		find(0,array,num,"");
		
	}
	
}