public static void nqueens(int col,char[][] mat,int num,List<List<String>>res){
if(col==num){
	List<String> temp= new ArrayList<>();
    for(int i=0;i<mat.length;i++){
        String temp1="";
        for(int j=0;j<mat[0].length;j++){
            temp1+=mat[i][j];
        }
        temp.add(temp1);
    }	
    res.add(temp);
}
for(int i=0;i<num;i++){

if(safe(i,col,mat,num)){

mat[i][col]='Q';
nqueens(col+1,mat,num,res);
mat[i][col]='.';
}
}

}  
public static boolean safe(int row,int col,char[][] mat,int num){
	int i,j;
	
	for(i=0;i<col;i++){
		if(mat[row][i]=='Q'){
			return false;
		}
	}
	
	int temprow=row;
	int tempcol=col;
	while(temprow<num && tempcol>=0){
		if(mat[temprow][tempcol]=='Q'){
			return false;
		}
		temprow++;
		tempcol--;
	}
	
	temprow=row;
	tempcol=col;
	
	while(temprow>=0 && tempcol>=0){
		if(mat[temprow][tempcol]=='Q'){
			return false;
		}
		temprow--;
		tempcol--;
	}
	
	return true;
}

    public List<List<String>> solveNQueens(int num) {
        List<List<String>> res=new ArrayList<>();
        char[][] mat=new char[num][num];

for(int i=0;i<num;i++){

for(int j=0;j<num;j++){
mat[i][j]='.';
}
}
nqueens(0,mat,num,res);
return res;
    }