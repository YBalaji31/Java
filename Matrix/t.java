
class Permutation{

public static void find(int[] array,boolean[] freq,String str){

if(str.length()==array.length*2){
System.out.println(str);
}

for(int i=0;i<array.length;i++){
if(!freq[i]){
freq[i]=true;
str+=""+array[i]+" ";
find(array,freq,str);
freq[i]=false;
str=str.substring(0,str.length()-2);
}

}
}

public static void main(String[] args){
int[] array={1,2,3};
boolean[] freq=new boolean[array.length];
find(array,freq,"");
} 
}