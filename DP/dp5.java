class dp5{
	static String res="";
	public static void lcs(int[][]dp,String s1,String s2,int i,int j){
		if(i<=0 || j<=0){
			return ;
		}
		if(s1.charAt(i-1)==s2.charAt(j-1))
		{
			lcs(dp,s1,s2,i-1,j-1);
			res+=s1.charAt(i-1);
		}
		else{
			int l,k;
			if(dp[i-1][j]>dp[i][j-1]){
				l=i-1;
				k=j;
				lcs(dp,s1,s2,l,k);
				res+=s2.charAt(j);
			}
			else{
				l=i;
				k=j-1;
				lcs(dp,s1,s2,l,k);
				res+=s1.charAt(i);
			}
			
		}
	}
	
public static void main(String[] args){

String s1="abcd";
String s2="abfc";

int[][] dp=new int[s1.length()+1][s2.length()+1];

for(int i=1;i<=s1.length();i++){
for(int j=1;j<=s2.length();j++){
if(s1.charAt(i-1)==s2.charAt(j-1)){
dp[i][j]=1+dp[i-1][j-1];
}
else{
dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
}
}
}




lcs(dp,s1,s2,s1.length(),s2.length());
System.out.println(res);
int temp1=(s1.length()+s2.length()-dp[s1.length()][s2.length()]);
System.out.println(temp1);
}
}