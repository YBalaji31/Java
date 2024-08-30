class Solution {
    public static boolean check(char[][] chess,int x,int y){
        int n=chess.length;
        for(int i=0;i<x;i++){
            if(chess[i][y]=='Q'){
                return false;
            }
        }
        for(int i=0;i<y;i++){
            if(chess[x][i]=='Q'){
                return false;
            }
        }
		int i=x;
		int j=y;
       while(x>=0 && y>=0){
        if(chess[x][y]=='Q'){
            return false;
        }
        else{
            x--;
            y--;
        }
       }
	   x=i;
	   y=j;
	   while(x>=0 && y>=0 && x<n && y<n){
        if(chess[x][y]=='Q'){
            return false;
        }
        else{
            x++;
            y--;
        }
       }
	   
       return true;

    }


    public static  void solve(char[][] chess,int ind,int n){
		
        if(ind==n){
            for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(chess[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			return;
        }
        for(int i=0;i<n;i++){
            if(ind>0 && !check(chess,ind,i)){
                continue;
            }
            chess[ind][i]='Q';
            solve(chess,ind+1,n);
            chess[ind][i]='.';
        }
        
    }
	
    public static void main(String[]args){
		int n=4;
        char[][] chess=new char[n][n];
        solve(chess,0,n);
	
	}
    
}