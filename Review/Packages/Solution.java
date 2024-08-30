class Solution{
   static int total=Integer.MIN_VALUE; 
    public static void check(int points[][],int ind,int last,int sum){
        System.out.println(ind+" "+last+" "+sum);
        if(ind==-1){
            if(total<sum){
                total=sum;
                
            }
            return;
        }
        for(int i=0;i<points[0].length;i++){
            if(i==last){
                continue;
            }
            check(points,ind-1,i,sum+points[ind][i]);
            
        }
        
    }
    
    
    public int maximumPoints(int points[][],int N){
        for(int i=0;i<points[0].length;i++){
            
            check(points,points.length-2,i,points[points.length-1][i]);
            
        }
        return total;
    }
	
	public static void main(String[] args){
	
	int[][] points={{7 ,1, 2},
{7 ,6 ,8},
{6 ,5, 2},
{3 ,1 ,1},
{2 ,5, 7},
{1 ,8 ,2},
{8 ,8, 8},
{8 ,4, 4},
{6 ,10, 10},
{9 ,2, 9}};
	
	}
}