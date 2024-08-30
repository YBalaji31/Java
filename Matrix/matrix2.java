import java.util.*;
class matrix2{
	
static int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
static String finpath="";
static int finsum=Integer.MIN_VALUE;
static boolean[][] visited; 
static int id=0;
public static void dfs(int x,int y,int sum,int[][] array,String path){
	//System.out.println(x+" "+y+" "+sum+" "+id+" "+array[x][y]);
	visited[x][y]=true;
	sum++;
	path+=" "+array[x][y]+" ";
	if(sum>finsum){
		finsum=sum;
		finpath=path;
	}
	for(int[] dirs:directions){
		int dx=x+dirs[0];
		int dy=y+dirs[1];
		
		if(dx>=0 && dy>=0 && dx<array.length && dy<array[0].length && visited[dx][dy]==false && array[x][y]<array[dx][dy]){
			//System.out.println(dx+" wsdf "+dy);
			dfs(dx,dy,sum,array,path);
			
		}
		
	}
	visited[x][y]=false;
}

public  static void main(String[] args){

Scanner sc=new Scanner(System.in);

int row=sc.nextInt();
int col=sc.nextInt();
int i,j;
visited=new boolean[row][col];
int[][] array=new int[row][col];
for(i=0;i<row;i++){
for(j=0;j<col;j++){
array[i][j]=sc.nextInt();
}
}

for(i=0;i<row;i++){
for(j=0;j<col;j++){
	id++;
dfs(i,j,0,array,"");
}
}

System.out.println();
System.out.println("The path is "+finpath);



}
}
